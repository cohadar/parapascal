package cohadar.ceditor.gui.tabs;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;

import javax.swing.JTextArea;

public class Console extends JTextArea implements Runnable {
	private final PipedInputStream pisSTDOUT = new PipedInputStream();

	private final Thread readerSTDOUT;

	private final boolean quit;

	public Console() {
		setEditable(false);

		try {
			PipedOutputStream pout = new PipedOutputStream(this.pisSTDOUT);
			System.setOut(new PrintStream(pout, true));
		} catch (java.io.IOException io) {
			this.append("Couldn't redirect STDOUT to this console\n"
					+ io.getMessage());
		} catch (SecurityException se) {
			this.append("Couldn't redirect STDOUT to this console\n"
					+ se.getMessage());
		}

		quit = false;

		readerSTDOUT = new Thread(this);
		readerSTDOUT.setDaemon(true);
		readerSTDOUT.start();
	}

	@Override
	public synchronized void run() {
		try {
			while (Thread.currentThread() == readerSTDOUT) {
				try {
					this.wait(100);
				} catch (InterruptedException ie) {
				}
				if (pisSTDOUT.available() != 0) {
					String input = this.readLine(pisSTDOUT);
					this.append(input);
				}
				if (quit)
					return;
			}
		} catch (Exception e) {
			this.append("\nConsole reports an Internal error.");
			this.append("The error is: " + e);
		}
	}

	private synchronized String readLine(PipedInputStream in)
			throws IOException {
		String input = "";
		do {
			int available = in.available();
			if (available == 0)
				break;
			byte b[] = new byte[available];
			in.read(b);
			input = input + new String(b, 0, b.length);
		} while (!input.endsWith("\n") && !input.endsWith("\r\n") && !quit);
		return input;
	}

	public void clear() {
		this.setText("");
	}
}
