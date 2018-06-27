package cohadar.assembler.code;

import cohadar.interpreter.kernel.MemorySpace;
import cohadar.interpreter.program.AsmFunction;
import cohadar.interpreter.program.AsmVariable;
import cohadar.interpreter.program.CCProgram;

class TextFunction extends TextLabel {
	int nArgs = 0;
	int nLocals = 0;
	private final TextParam[] args;
	private final TextParam[] locals;
	private final int retSize;

	public TextFunction(int line, String labelName, TextParam[] args, TextParam[] locals, int retSize) {
		super(line, labelName);
		this.args = args;
		this.locals = locals;
		this.retSize = retSize;
	}

	@Override
	public void compile(AsmSource src, CCProgram prog) {
		src.clearLocalVariables();
		int address = 0;
		if (args != null) {
			nArgs = 0;
			for (TextParam p : args) {
				AsmVariable var = new AsmVariable(MemorySpace.LOCAL, p.name, address, p.size);
				nArgs += p.size;
				address += p.size;
				src.add2LocalVariables(sourceLine, var);
			}
		}
		if (locals != null) {
			nLocals = 0;
			for (TextParam p : locals) {
				AsmVariable var = new AsmVariable(MemorySpace.LOCAL, p.name, address, p.size);
				address += p.size;
				nLocals += p.size;
				src.add2LocalVariables(sourceLine, var);
			}
		}

		if (retSize > 0) {
			AsmVariable var = new AsmVariable(MemorySpace.LOCAL, labelName.substring(1), address, retSize);
			src.add2LocalVariables(sourceLine, var);
		}

		AsmFunction func = src.resolveFunction(labelName);
		func.setParams(nArgs, nLocals, retSize);
		prog._function(func);
	}

}
