package cohadar.pascal.gui.menus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import cohadar.pascal.gui.PasFrame;

public class PasHelpMenu extends JMenu implements ActionListener {

	private final PasFrame pasFrame;
	private final JMenuItem about;
	private final JMenuItem keywords;
	private final JMenuItem functions;

	public PasHelpMenu(PasFrame pasFrame) {
		super("Help");
		this.pasFrame = pasFrame;
		this.setMnemonic(KeyEvent.VK_H);

		keywords = new JMenuItem("Keywords");
		keywords.addActionListener(this);
		keywords.setMnemonic(KeyEvent.VK_K);
		this.add(keywords);

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
		pasFrame.clearAndSelectConsole();
		if (e.getSource() == about) {
			this.about();
		} else if (e.getSource() == functions) {
			this.listFunctions();
		} else if (e.getSource() == keywords) {
			this.listKeywords();
		}
	}

	private void listFunctions() {
		System.out.println("abs(real):real");
		System.out.println("sin(real):real");
		System.out.println("cos(real):real");
		System.out.println("arctan(real):real");
		System.out.println("ln(real):real");
		System.out.println("exp(real):real");
		System.out.println("sqr(real):real");
		System.out.println("sqrt(real):real");
		System.out.println("trunc(real):integer");
		System.out.println("round(real):integer");
		System.out.println("random(integer):integer");
		System.out.println("write(...);");
		System.out.println("writeln(...);");
		System.out.println("sleep(integer);");
		System.out.println("init(semaphore, integer);");
		System.out.println("wait(semaphore);");
		System.out.println("signal(semaphore);");
	}

	private void about() {
		pasFrame.about();
	}

	private void listKeywords() {
		System.out.println("CONCURRENT:   cobegin cend cofor shared semaphore region await");
		System.out.println("GLOBAL:       program const type var procedure function");
		System.out.println("TYPE:         boolean integer real array of [] record");
		System.out.println("STATEMENTS:   begin end if then else");
		System.out.println(" LOOPS:       while do repeat until for to downto break");
		System.out.println("EXPRESSIONS:  () := ");
		System.out.println(" ARITHMETIC:  + - * / div mod");
		System.out.println(" COMPARISON:  = <> < <= > >=");
		System.out.println(" LOGIC:       and or xor not true false");
		System.out.println("COMMENTS:     // line { multi-line }");
	}

}
