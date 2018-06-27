package cohadar.ceditor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

// call config.load at the start of application
// call config.store at the end of application
public class Config extends Properties {

	private final String fileName;

	public Config(String fileName) {
		this.fileName = fileName;
	}

	private void setDefaultProperties() {
		this.setProperty("WORK_DIRECTORY", ".");
	}

	public String getWorkDirectory() {
		return this.getProperty("WORK_DIRECTORY");
	}

	public void setWorkDirectory(String parent) {
		if (parent != null) {
			this.setProperty("WORK_DIRECTORY", parent);
		}
	}

	public void load() {

		setDefaultProperties();
		FileInputStream in = null;
		try {
			in = new FileInputStream(fileName);
			this.load(in);
		} catch (FileNotFoundException e) {
			System.out
					.printf("File %s not found; creating it now...", fileName);
			store();
		} catch (IOException e) {
			System.err
					.printf("ERROR: cannot load file %s - reverting to default configuration",
							fileName);
			setDefaultProperties();
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void store() {
		FileOutputStream out = null;
		try {
			out = new FileOutputStream(fileName);
			this.store(out, "delete this file to restore default values");
		} catch (IOException e) {
			System.err.println("ERROR: Cannot write configuration file "
					+ fileName);
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
