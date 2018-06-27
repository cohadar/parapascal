package cohadar.interpreter.system;

import java.util.Random;

import cohadar.interpreter.kernel.IProcess;

// returns random integer in range [0..n-1)
class MATH_IRAND extends SystemFunction {
	private static Random generator = new Random();

	@Override
	public void run(IProcess proc) {
		int n = proc.pop();
		proc.push(generator.nextInt(n));
	}

	@Override
	public boolean needsSharedLock() {
		return false;
	}
}
