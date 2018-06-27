package cohadar.interpreter.instructions.memory;

import cohadar.interpreter.instructions.AbstractInstruction0;
import cohadar.interpreter.kernel.ExitCode;
import cohadar.interpreter.kernel.IProcess;

// check if integer in bounds
public class RANGE extends AbstractInstruction0 {

	@Override
	public boolean run(IProcess proc) {
		int high = proc.pop();
		int low = proc.pop();
		int value = proc.pop();

		if ((value < low) || (value > high)) {
			proc.exit(ExitCode.RANGE_ERROR, String.format("Range Check Error: [%d..%d] ~ %d", low, high, value));
		} else {
			proc.push(value);
		}
		return false;
	}
}
