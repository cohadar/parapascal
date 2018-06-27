package cohadar.util;

import java.util.LinkedList;
import java.util.List;

public class ErrLogger {
	private final List<Err> errs = new LinkedList<Err>();

	public void reset() {
		errs.clear();
	}

	public void append(int type, int line, String plain) {
		errs.add(new Err(type, line, plain));
	}

	public void append(int type, int line, String format, Object... args) {
		errs.add(new Err(type, line, format, args));
	}

	public boolean hasErrs() {
		return !errs.isEmpty();
	}

	public int getErrCount() {
		return errs.size();
	}

	public Err getErr(int index) {
		return errs.get(index);
	}

	public String getAllErrText() {
		StringBuilder ret = new StringBuilder();
		for (Err e : errs) {
			ret.append(e);
			ret.append('\n');
		}
		return ret.toString();
	}
}
