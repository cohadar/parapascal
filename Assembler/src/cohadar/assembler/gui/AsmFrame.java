package cohadar.assembler.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.Timer;

import cohadar.assembler.Assembler;
import cohadar.assembler.Job;
import cohadar.assembler.JobBuffer;
import cohadar.assembler.JobResults;
import cohadar.assembler.KernelThread;
import cohadar.assembler.gui.menus.AsmHelpMenu;
import cohadar.assembler.gui.menus.ProcessorsMenu;
import cohadar.assembler.gui.menus.SchedulerMenu;
import cohadar.assembler.gui.menus.SemaphoreMenu;
import cohadar.ceditor.Config;
import cohadar.ceditor.ResourceLoader;
import cohadar.ceditor.gui.AboutDialog;
import cohadar.ceditor.gui.AbstractFrame;
import cohadar.ceditor.gui.IFrameSetup;
import cohadar.interpreter.kernel.StatisticModel;
import cohadar.interpreter.kernel.schedulers.SchedulerMaster;
import cohadar.interpreter.program.CCProgram;

public class AsmFrame extends AbstractFrame implements ActionListener {
	protected final ProcessorsMenu processorMenu;
	protected final SchedulerMenu schedulerMenu;
	protected final SemaphoreMenu semaphoreMenu;
	private final Timer periodic;

	protected final JobBuffer jobBuffer;
	private final KernelThread kernelThread;
	private final AboutDialog aboutDialog;

	public String getAboutText() {
		return "ParaAssembler v1.0 (part of ParaPascal)";
	}

	public ImageIcon getAboutIcon() {
		return ResourceLoader.ICON_ASM;
	}

	protected JMenu createHelpMenu() {
		return new AsmHelpMenu(this);
	}

	public AsmFrame(Config config, IFrameSetup setup) {
		super(config, setup);
		aboutDialog = new AboutDialog(this, getAboutText(), getAboutIcon());

		menubar.add(processorMenu = new ProcessorsMenu());
		menubar.add(schedulerMenu = new SchedulerMenu(SchedulerMaster.getNames()));
		menubar.add(semaphoreMenu = new SemaphoreMenu());
		menubar.add(createHelpMenu());

		statPane.setModel(new StatisticModel());

		jobBuffer = new JobBuffer();
		kernelThread = new KernelThread(jobBuffer);
		kernelThread.start();

		periodic = new Timer(300, this);
		periodic.start();
	}

	@Override
	public void run() {
		tabs.clearAll();
		tabs.selectConsole();
		try {
			CCProgram program = Assembler.assemble(editor.getText());
			if (Assembler.erlog.hasErrs()) {
				tabs.displayProblems(Assembler.erlog.getAllErrText());
				tabs.selectProblems();
			} else {
				jobBuffer.putJob(new Job(program, schedulerMenu.getSchedulerName(), processorMenu.getProcessorCount()));
				running = true;
				updateStatus();
			}
		} catch (Exception e) {
			JOptionPane
					.showMessageDialog(this, e.getMessage(), e.getClass().getSimpleName(), JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
	}

	@Override
	public void codeListing() {
		tabs.clearAll();
		try {
			CCProgram program = Assembler.assemble(editor.getText());
			if (Assembler.erlog.hasErrs()) {
				tabs.displayProblems(Assembler.erlog.getAllErrText());
				tabs.selectProblems();
			} else {
				System.out.println(program.getListing());
				tabs.selectConsole();
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, e.getMessage(), "RuntimeException", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
	}

	@Override
	public void terminate() {
		kernelThread.interrupt();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (jobBuffer.isItDone()) {
			JobResults results = jobBuffer.getResults();
			if (results != null) {
				onTerminate(results);
			}
		}
	}

	private void onTerminate(JobResults results) {
		running = false;
		updateStatus();
		StatisticModel model = results.getStatisticModel();
		statPane.setModel(model);

		String title = null;
		String msg = null;
		int type = 0;
		Exception e = results.getException();
		if (e == null) {
			if (model.getErrorCount() == 0) {
				title = "Program Terminated";
				msg = "Everything OK";
				type = JOptionPane.INFORMATION_MESSAGE;
			} else {
				title = "Program Terminated";
				msg = "Errors: " + model.getErrorCount();
				type = JOptionPane.WARNING_MESSAGE;
			}
		} else {
			title = e.getClass().getSimpleName();
			msg = e.getMessage();
			type = JOptionPane.ERROR_MESSAGE;
			e.printStackTrace();
		}
		msg += String.format("\n  CPU count: %d\n  CPU usage: %d%%\n  CPU cycles: %d", results.getProcessorCount(),
				results.getConcurrency(), results.getCycles());
		JOptionPane.showMessageDialog(this, msg, title, type);
	}

	@Override
	protected void updateStatus() {
		super.updateStatus();
		if (running) {
			schedulerMenu.setEnabled(false);
			processorMenu.setEnabled(false);
			semaphoreMenu.setEnabled(false);
		} else {
			schedulerMenu.setEnabled(true);
			processorMenu.setEnabled(true);
			semaphoreMenu.setEnabled(true);
		}
	}

	public void clearAndSelectConsole() {
		tabs.clearConsole();
		tabs.selectConsole();
	}

	public void about() {
		aboutDialog.setVisible(true);
	}
}