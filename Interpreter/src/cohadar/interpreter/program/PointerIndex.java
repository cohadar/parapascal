package cohadar.interpreter.program;

import java.util.ArrayList;
import java.util.List;

import cohadar.interpreter.exceptions.PointerIndexException;

public class PointerIndex {

	private final List<Object> pool = new ArrayList<Object>();

	public PointerIndex() {
		// zero index in constant pool contains null value
		pool.add(null);
	}

	// returns pointer index of some object
	public int add(Object c) {
		if (c == null) {
			return 0;
		}
		if (c instanceof Integer) {
			return (Integer) c;
		}
		if (c instanceof Float) {
			return Float.floatToIntBits((Float) c);
		}
		if (c instanceof Boolean) {
			return ((Boolean) c) ? -1 : 0; // -1 == 0xFFFFFFFF
		}
		pool.add(c);
		return pool.size() - 1;
	}

	// gets object from pointer index
	public Object get(int index) {
		Object ret = null;
		try {
			ret = pool.get(index);
		} catch (IndexOutOfBoundsException e) {
			throw new PointerIndexException(e.getMessage());
		}
		return ret;
	}

	public int size() {
		return pool.size();
	}

	public PointerIndex copy() {
		PointerIndex ret = new PointerIndex();
		for (int i = 1; i < this.pool.size(); i++) {
			ret.pool.add(this.pool.get(i));
		}
		return ret;
	}
}
