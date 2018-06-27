package cohadar.assembler.code;

import cohadar.interpreter.kernel.MemorySpace;
import cohadar.interpreter.program.AsmVariable;
import cohadar.interpreter.program.CCProgram;

class TextGlobal implements TextLine {

	final String name;
	final int size;
	final boolean shared;
	final int line;

	public TextGlobal(int line, String name, int size, boolean shared) {
		this.line = line;
		this.name = name;
		this.size = size;
		this.shared = shared;
	}

	@Override
	public void compile(AsmSource src, CCProgram prog) {
		AsmVariable global = null;
		if (shared) {
			global = new AsmVariable(MemorySpace.SHARED, name, src.nShared, size);
			src.nShared += size;
			prog.addSharedVariable(size);
		} else {
			global = new AsmVariable(MemorySpace.INSTANCE, name, src.nInstance, size);
			src.nInstance += size;
			prog.addInstanceVariable(size);
		}
		src.add2Variables(line, global);
	}

}
