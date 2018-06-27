package cohadar.pascal.grammar;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;

public class MyFileStream extends ANTLRFileStream implements ICharStream {

	public MyFileStream(String fileName) throws IOException {
		super(fileName);
	}

	@Override
	public void prepare() {
		int size = data.length;
		if (size > 1) {
			// replace ".." with "::" to avoid problems when lexing real numbers
			for (int i = 0; i < size - 1; i++) {
				if ((data[i] == '.') && (data[i + 1] == '.')) {
					data[i] = ':';
					data[i + 1] = ':';
				}
			}
		}
	}

}
