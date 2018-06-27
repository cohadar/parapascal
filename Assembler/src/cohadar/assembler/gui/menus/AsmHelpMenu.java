package cohadar.assembler.gui.menus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import cohadar.assembler.gui.AsmFrame;

public class AsmHelpMenu extends JMenu implements ActionListener {

	private final AsmFrame asmFrame;
	private final JMenuItem about;
	private final JMenuItem instructions;
	private final JMenuItem functions;

	public AsmHelpMenu(AsmFrame asmFrame) {
		super("Help");
		this.asmFrame = asmFrame;
		this.setMnemonic(KeyEvent.VK_H);

		instructions = new JMenuItem("Instructions");
		instructions.addActionListener(this);
		instructions.setMnemonic(KeyEvent.VK_I);
		this.add(instructions);

		functions = new JMenuItem("Functions");
		functions.addActionListener(this);
		functions.setMnemonic(KeyEvent.VK_F);
		this.add(functions);

		about = new JMenuItem("About");
		about.addActionListener(this);
		about.setMnemonic(KeyEvent.VK_A);
		this.add(about);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		asmFrame.clearAndSelectConsole();
		if (e.getSource() == about) {
			this.about();
		} else if (e.getSource() == functions) {
			this.listFunctions();
		} else if (e.getSource() == instructions) {
			this.listInstructions();
		}
	}

	private void listFunctions() {
		System.out.println("%MATH_ABS");
		System.out.println("%MATH_SIN");
		System.out.println("%MATH_COS");
		System.out.println("%MATH_ARCTAN");
		System.out.println("%MATH_LN");
		System.out.println("%MATH_EXP");
		System.out.println("%MATH_SQR");
		System.out.println("%MATH_SQRT");
		System.out.println("%MATH_TRUNC");
		System.out.println("%MATH_ROUND");
		System.out.println("%MATH_IRAND");
		System.out.println("%MATH_RRAND");
		System.out.println("%PRINT_BOOLEAN ");
		System.out.println("%PRINT_CREF");
		System.out.println("%PRINT_NL");
		System.out.println("%PRINT_REAL");
		System.out.println("%PROC_SLEEP");
		System.out.println("%SEM_INIT");
		System.out.println("%SEM_WAIT");
		System.out.println("%SEM_SIGNAL");
	}

	private void about() {
		asmFrame.about();
	}

	private void listInstructions() {
		System.out.println("ARITHMETIC:   add sub mul div mod inc dec neg");
		System.out.println("F-ARITHMETIC: fadd fsub fmul fdiv fmod finc fdec fneg i2f");
		System.out.println("COMPARISON:   eq neq lt lte gt gte");
		System.out.println("F-COMPARISON: feq fneq flt flte fgt fgte");
		System.out.println("LOGIC:        and or xor not");
		System.out.println("STACK:        const dis dup nop swap");
		System.out.println("PROGRAM FLOW: br brz brnz call ret fork join exit syscall");
		System.out.println("MEMORY:       addr load store aload astore bload bstore index range");
	}

}
