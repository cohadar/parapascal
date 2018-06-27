package cohadar.interpreter.kernel;

import java.util.HashMap;
import java.util.Map;

import cohadar.interpreter.exceptions.DeadlockException;
import cohadar.interpreter.exceptions.SchedulerException;
import cohadar.interpreter.kernel.schedulers.IScheduler;
import cohadar.interpreter.kernel.schedulers.SchedulerMaster;
import cohadar.interpreter.program.AsmInstruction;
import cohadar.interpreter.program.AsmLabel;
import cohadar.interpreter.program.CCProgram;

public class Kernel implements IKernel {
	private final Map<Integer, PCB> all = new HashMap<Integer, PCB>();

	private final PCBState RUNNING = new PCBState("RUNNING");
	private final PCBState READY = new PCBState("READY");
	private final PCBState WAITING = new PCBState("WAITING"); // for children
	private final PCBState BLOCKED = new PCBState("BLOCKED"); // on semaphore
	private final PCBState SLEEPING = new PCBState("SLEEPING"); // timer
	private final PCBState DEAD = new PCBState("DEAD"); // normal exit
	private final PCBState ERROR = new PCBState("ERROR"); // error exit

	// not affected by reset
	private IScheduler scheduler;

	private int sid;
	private int processorCount = 4;

	private long cycles;

	// shared memory lock
	private boolean locked;

	public Kernel() {
		scheduler = SchedulerMaster.get(0);
		reset();
	}

	public void reset() {
		locked = false;
		cycles = 0;
		all.clear();
		scheduler.reset();
		// processorCount = 4;
		sid = 0;

		RUNNING.reset();
		READY.reset();
		WAITING.reset();
		BLOCKED.reset();
		SLEEPING.reset();
		DEAD.reset();
		ERROR.reset();
	}

	private PCB loadProcess(IProcess proc) {
		int newId = proc.getId();
		PCB pcb = new PCB(this, newId, proc);
		all.put(newId, pcb);
		READY.safeAdd(pcb);
		return pcb;
	}

	public IProcess loadProgram(CCProgram prog) {
		int id = all.size();
		CCProcess proc = new CCProcess(id, this, prog.getStartPosition(), prog.getCode(), prog.getSharedSize(),
				prog.getInstanceSize(), prog.getPointerIndex());
		loadProcess(proc);
		return proc;
	}

	private PCB getReadyPCB(int id) {
		PCB ret = all.get(id);
		if (ret.getState() == READY) {
			return ret;
		} else {
			return null;
		}
	}

	private PCB getNextPCB() {
		if (READY.size() == 0) {
			return null;
		} else {
			int id = scheduler.getNextProcessId(this);
			PCB pcb = getReadyPCB(id);
			if (pcb == null) {
				throw new SchedulerException(scheduler.getName(), id);
			}
			return pcb;
		}
	}

	public int runOneCycle(boolean print) {
		int count = 0;

		PCB current = null;
		while ((current = getNextPCB()) != null) {
			RUNNING.safeAdd(current);
			count++;
			if (count >= processorCount) {
				break;
			}
		}

		// this for must be descending
		for (int i = RUNNING.size() - 1; i >= 0; i--) {
			PCB pcb = RUNNING.get(i);
			AsmInstruction inst = pcb.getProcess().runOneInstruction();
			if (print) {
				System.out.printf("[%02X]\t%s\n", pcb.getId(), inst);
			}
			if (pcb.getState() == RUNNING) {
				READY.safeAdd(pcb);
			}
		}

		long time = System.currentTimeMillis();
		// this for must be descending
		for (int i = SLEEPING.size() - 1; i >= 0; i--) {
			PCB pcb = SLEEPING.get(i);
			if (time >= pcb.getWakeupTime()) {
				READY.safeAdd(pcb);
			}
		}

		if (count == 0) {
			int active = READY.size() + SLEEPING.size();
			int pasive = WAITING.size() + BLOCKED.size();
			if (active == 0) {
				if (pasive == 0) {
					return -1; // normal end of kernel execution
				} else {
					throw new DeadlockException();
				}
			}
		}

		locked = false;
		cycles++;
		return count;
	}

	// === functions used by schedulers
	@Override
	public int getReadyProcessCount() {
		return READY.size();
	}

	@Override
	public int getReadyProcessId(int index) {
		return READY.get(index).getId();
	}

	@Override
	public boolean isProcessReady(int id) {
		return getReadyPCB(id) != null;
	}

	// =======================

	PCB getPCB(IProcess proc) {
		return all.get(proc.getId());
	}

	// called from PCB
	void lastChildExited(PCB pcb) {
		if (pcb.getState() == WAITING) {
			READY.safeAdd(pcb);
		}
	}

	// called from Process
	public void fork(IProcess proc, AsmLabel label) {
		IProcess p = new CCProcess(all.size(), (CCProcess) proc);
		p.br(label);
		PCB pcb = loadProcess(p);
		pcb.fork();
	}

	// called from Process
	public void join(IProcess proc) {
		PCB pcb = getPCB(proc);
		if (pcb.join()) {
			WAITING.safeAdd(pcb);
		}
	}

	// called from Process
	public void exit(IProcess proc, int exitCode, String msg) {
		PCB pcb = getPCB(proc);
		pcb.exit(exitCode, msg);
		if (exitCode == 0) {
			DEAD.safeAdd(pcb);
		} else {
			ERROR.safeAdd(pcb);
		}
	}

	// called from Process
	public void sleep(IProcess proc, int milis) {
		PCB pcb = getPCB(proc);
		pcb.sleep(milis);
		SLEEPING.safeAdd(pcb);
	}

	// called from Process
	public void block(IProcess proc) {
		PCB pcb = getPCB(proc);
		BLOCKED.safeAdd(pcb);
	}

	// called from Process
	public void unblock(IProcess proc) {
		PCB pcb = getPCB(proc);
		READY.safeAdd(pcb);
	}

	public int getProcessExitCode(int id) {
		return all.get(id).getExitCode();
	}

	public String getProcessExitMessage(int id) {
		return all.get(id).getExitMessage();
	}

	public void setScheduler(String schedulerName) {
		IScheduler s = SchedulerMaster.get(schedulerName);
		if (s == null) {
			throw new RuntimeException("Unknown Scheduler Name: " + schedulerName);
		} else {
			this.scheduler = s;
		}
	}

	public void setScheduler(int index) {
		IScheduler s = SchedulerMaster.get(index);
		if (s == null) {
			throw new RuntimeException("Bad Scheduler Index: " + index);
		} else {
			this.scheduler = s;
		}
	}

	public String getScheduler() {
		return scheduler.getName();
	}

	public int getNewSemaphoreId() {
		return sid++;
	}

	public StatisticModel getStatisticModel() {
		int errors = 0;
		int count = all.size();
		String[] idz = new String[count];
		String[] exitz = new String[count];
		count = 0;
		for (PCB x : all.values()) {
			idz[count] = String.format("[%02X] %s", x.getId(), x.getState());
			if (x.getExitCode() != 0) {
				errors++;
			}
			exitz[count] = x.getExitMessage();
			if (exitz[count] == null) {
				exitz[count] = "Exception";
			}
			count++;
		}
		return new StatisticModel(idz, exitz, errors);
	}

	public void setProcessorCount(int processorCount) {
		this.processorCount = processorCount;
	}

	public long getCycles() {
		return cycles;
	}

	public boolean acquireSharedLock() {
		if (locked == false) {
			locked = true;
			return true;
		} else {
			return false;
		}
	}

}
