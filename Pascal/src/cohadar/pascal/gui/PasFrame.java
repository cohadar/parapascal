package cohadar.pascal.gui;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JOptionPane;

import cohadar.assembler.Assembler;
import cohadar.assembler.Job;
import cohadar.assembler.gui.AsmFrame;
import cohadar.ceditor.Config;
import cohadar.ceditor.ResourceLoader;
import cohadar.ceditor.gui.IFrameSetup;
import cohadar.interpreter.program.CCProgram;
import cohadar.pascal.PCompiler;
import cohadar.pascal.gui.menus.PasHelpMenu;

public class PasFrame extends AsmFrame {

	public PasFrame(Config config, IFrameSetup setup) {
		super(config, setup);
	}

	@Override
	public String getAboutText() {
		return "ParaPascal v1.0";
	}

	@Override
	public ImageIcon getAboutIcon() {
		return ResourceLoader.ICON_PAS;
	}

	@Override
	protected JMenu createHelpMenu() {
		return new PasHelpMenu(this);
	}

	@Override
	public void run() {
		tabs.clearAll();
		tabs.selectConsole();
		try {
			String asm = PCompiler.getListing(editor.getText());
			if (PCompiler.erlog.hasErrs()) {
				tabs.displayProblems(PCompiler.erlog.getAllErrText());
				tabs.selectProblems();
			} else {
				CCProgram program = Assembler.assemble(asm);
				if (Assembler.erlog.hasErrs()) {
					throw new RuntimeException("Assembler Error:\n" + Assembler.erlog.getAllErrText());
				}
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
			String asm = PCompiler.getListing(editor.getText());
			if (PCompiler.erlog.hasErrs()) {
				tabs.displayProblems(PCompiler.erlog.getAllErrText());
				tabs.selectProblems();
			} else {
				System.out.println(asm);
				tabs.selectConsole();
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, e.getMessage(), "RuntimeException", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
	}

}
