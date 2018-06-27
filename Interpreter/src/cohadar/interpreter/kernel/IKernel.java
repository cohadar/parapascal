package cohadar.interpreter.kernel;

public interface IKernel {
	int getReadyProcessCount();

	int getReadyProcessId(int index);

	boolean isProcessReady(int id);
}
