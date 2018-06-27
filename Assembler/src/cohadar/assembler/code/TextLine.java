package cohadar.assembler.code;

import cohadar.interpreter.program.CCProgram;

interface TextLine {
	void compile(AsmSource src, CCProgram prog);
}
