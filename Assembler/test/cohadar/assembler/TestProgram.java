package cohadar.assembler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import cohadar.interpreter.BaseTest;

public abstract class TestProgram extends BaseTest {
	protected static final int TRUE = -1;
	protected static final int FALSE = 0;

	protected static final int d111 = 111;
	protected static final int d222 = 222;
	protected static final int d333 = 333;
	protected static final int d444 = 444;
	protected static final int d555 = 555;
	protected static final int d666 = 666;
	protected static final int d777 = 777;
	protected static final int d888 = 888;
	protected static final int d999 = 999;

	protected static final int[] d = { 0, d111, d222, d333, d444, d555, d666, d777, d888, d999 };

	protected static final float f111 = 11.1f;
	protected static final float f222 = 22.2f;
	protected static final float f333 = 33.3f;
	protected static final float f444 = 44.4f;

	public abstract String getPath();

	public String slurpTest(String fileName) {
		File file = new File(getPath() + fileName);
		StringBuilder sb = new StringBuilder();
		try {

			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				sb.append(line);
				sb.append('\n');
			}

			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		return sb.toString();
	}

}
