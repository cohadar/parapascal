package cohadar.assembler.code;

import java.util.ArrayList;
import java.util.List;

public class AsmFragment {
	List<TextLine> lines = new ArrayList<TextLine>();

	// =========================================================================
	// BASIC
	// =========================================================================
	public void addInstruction0(int line, String instrName) {
		lines.add(new TextInstruction0(line, instrName));
	}

	public void addInstructionConstant(int line, String instrName, Object constant) {
		lines.add(new TextInstructionConstant(line, instrName, constant));
	}

	public void addInstructionLabel(int line, String instrName, String labelName) {
		lines.add(new TextInstructionLabel(line, instrName, labelName));
	}

	public void addInstructionSyscall(int line, String instrName, String sysFuncName) {
		lines.add(new TextInstructionSyscall(line, instrName, sysFuncName));
	}

	public void addInstructionVariable(int line, String instrName, String variableName) {
		lines.add(new TextInstructionVariable(line, instrName, variableName));
	}

	public void addLabel(int line, String labelName) {
		lines.add(new TextLabel(line, labelName));
	}

	public void addBreakpoint(int sourceLine) {
		lines.add(new TextBreakpoint(sourceLine));
	}

	public void addGlobal(int line, String name, int size, boolean shared) {
		lines.add(new TextGlobal(line, name, size, shared));
	}

	public void addFunction(int line, String name, TextParam[] args, TextParam[] locals, int retSize) {
		lines.add(new TextFunction(line, name, args, locals, retSize));
	}

	// =========================================================================
	// COMPLEX
	// =========================================================================
	public void append(AsmFragment frag) {
		lines.addAll(frag.lines);
	}
}
