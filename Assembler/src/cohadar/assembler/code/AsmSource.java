package cohadar.assembler.code;

import java.util.HashMap;
import java.util.Map;

import cohadar.assembler.AsmErrs;
import cohadar.interpreter.program.AsmFunction;
import cohadar.interpreter.program.AsmLabel;
import cohadar.interpreter.program.AsmVariable;
import cohadar.interpreter.program.CCProgram;
import cohadar.util.ErrLogger;

public class AsmSource extends AsmFragment {
	protected Map<String, AsmLabel> labels = new HashMap<String, AsmLabel>();
	protected Map<String, AsmFunction> functions = new HashMap<String, AsmFunction>();
	protected Map<String, AsmVariable> variables = new HashMap<String, AsmVariable>();
	protected Map<String, AsmVariable> localVariables = new HashMap<String, AsmVariable>();
	final ErrLogger erlog;

	int nShared = 0;

	int nInstance = 0;

	void add2Labels(int line, AsmLabel label) {
		if (labels.containsKey(label.getName())) {
			erlog.append(AsmErrs.DUPLICATE_NAME, line, "Duplicate label name: " + label.getName());
		} else {
			labels.put(label.getName(), label);
		}
	}

	void add2Functions(int line, AsmFunction func) {
		if (functions.containsKey(func.getName())) {
			erlog.append(AsmErrs.DUPLICATE_NAME, line, "Duplicate function name: " + func.getName());
		} else {
			functions.put(func.getName(), func);
		}
	}

	void add2Variables(int line, AsmVariable var) {
		if (variables.containsKey(var.getName())) {
			erlog.append(AsmErrs.DUPLICATE_NAME, line, "Duplicate variable name: " + var.getName());
		} else {
			variables.put(var.getName(), var);
		}
	}

	void add2LocalVariables(int line, AsmVariable var) {
		if (localVariables.containsKey(var.getName())) {
			erlog.append(AsmErrs.DUPLICATE_NAME, line, "Duplicate local variable name: " + var.getName());
		} else {
			localVariables.put(var.getName(), var);
		}
	}

	public AsmSource(ErrLogger erlog) {
		this.erlog = erlog;
	}

	public CCProgram compile() {
		CCProgram ret = new CCProgram();
		collectLabels();
		for (TextLine t : lines) {
			t.compile(this, ret);
		}
		return ret;
	}

	AsmVariable resolveVariable(String name) {
		AsmVariable ret = localVariables.get(name);
		if (ret == null) {
			ret = variables.get(name);
		}
		return ret;
	}

	AsmFunction resolveFunction(String funcName) {
		return functions.get(funcName);
	}

	AsmLabel resolveLabel(String labelName) {
		return labels.get(labelName);
	}

	// first pass - handles forward referencing and name collisions
	private void collectLabels() {
		// program functions
		for (TextLine t : lines) {
			if (t instanceof TextFunction) {
				TextFunction tfunct = (TextFunction) t;
				AsmFunction label = new AsmFunction(tfunct.labelName);
				add2Labels(tfunct.sourceLine, label);
				add2Functions(tfunct.sourceLine, label);
			} else if (t instanceof TextLabel) {
				TextLabel tlab = (TextLabel) t;
				AsmLabel label = new AsmLabel(tlab.labelName);
				add2Labels(tlab.sourceLine, label);
			}
		}

	}

	void clearLocalVariables() {
		localVariables.clear();
	}

}
