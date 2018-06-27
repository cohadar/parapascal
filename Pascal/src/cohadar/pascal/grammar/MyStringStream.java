package cohadar.pascal.grammar;

import org.antlr.runtime.ANTLRStringStream;

public class MyStringStream extends ANTLRStringStream implements ICharStream {

	public MyStringStream(String text) {
		super(text);
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
