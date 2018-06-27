package cohadar.interpreter.instructions.memory;

import cohadar.interpreter.instructions.AbstractInstruction0;
import cohadar.interpreter.kernel.ExitCode;
import cohadar.interpreter.kernel.IProcess;

// check if index in array bounds and shift to zero-index
public class INDEX extends AbstractInstruction0 {

	@Override
	public boolean run(IProcess proc) {
		int high = proc.pop();
		int low = proc.pop();
		int index = proc.pop();

		if ((index < low) || (index > high)) {
			proc.exit(ExitCode.INDEX_ERROR, String.format("Array Index Error: [%d..%d] ~ %d", low, high, index));
		} else {
			proc.push(index - low);
		}
		return false;
	}
}
