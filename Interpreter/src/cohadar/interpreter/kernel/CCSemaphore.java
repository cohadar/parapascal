package cohadar.interpreter.kernel;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import cohadar.interpreter.exceptions.DoubleInitOfSemaphore;

public class CCSemaphore {
	private final int id;
	private boolean initialized = false;
	private int value;
	private final List<IProcess> blocked = new ArrayList<IProcess>();
	private final static String[] names = { "Signal & Continue", "Signal & Wait" };
	private static boolean SandW = false;

	public CCSemaphore(int id) {
		this.id = id;
	}

	public void doInit(int startValue) {
		if (initialized) {
			throw new DoubleInitOfSemaphore(id);
		} else {
			value = startValue;
			initialized = true;
		}
	}

	public void doWait(IProcess proc) {
		--value;
		if (value < 0) {
			proc.block(this);
			blocked.add(proc);
		}
	}

	private static Random rand = new Random();

	public void doSignal(IProcess proc) {
		++value;
		if (blocked.size() > 0) {
			IProcess p2 = blocked.remove(rand.nextInt(blocked.size()));
			p2.unblock(this);
			if (SandW) {
				proc.sleep(0);
			}
		}
	}

	@Override
	public String toString() {
		return String.format("<semaphore='%d'>", id);
	}

	public int getId() {
		return id;
	}

	public static void setDiscipline(String name) {
		SandW = names[1].equals(name);
	}

	public static void setDiscipline(int index) {
		SandW = (index == 1);
	}

	public static String[] getNames() {
		return names;
	}
}
