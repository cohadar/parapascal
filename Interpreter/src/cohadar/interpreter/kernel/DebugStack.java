package cohadar.interpreter.kernel;

import java.util.Stack;

public class DebugStack {
	private final Stack<Integer> _stack = new Stack<Integer>();

	public void push(int x) {
		_stack.push(x);
	}

	public void pushf(float f) {
		_stack.push(Float.floatToIntBits(f));
	}

	public int pop() {
		return _stack.pop();
	}

	public float popf() {
		return Float.intBitsToFloat(_stack.pop());
	}

	public boolean isEmpty() {
		return _stack.isEmpty();
	}
}
