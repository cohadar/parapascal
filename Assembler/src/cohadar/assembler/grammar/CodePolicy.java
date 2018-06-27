package cohadar.assembler.grammar;

import java.util.List;

import org.antlr.runtime.Token;

import cohadar.assembler.AsmErrs;
import cohadar.assembler.code.AsmSource;
import cohadar.assembler.code.TextParam;
import cohadar.interpreter.program.CCProgram;
import cohadar.util.ErrLogger;
import cohadar.util.Util;

public class CodePolicy implements IParserPolicy {
	private final ErrLogger erlog;
	private final AsmSource source;

	public CodePolicy(ErrLogger erlog) {
		this.erlog = erlog;
		source = new AsmSource(erlog);
	}

	public CCProgram getProgram() {
		return source.compile();
	}

	// default program segment is code segment!
	private int currentSegment = AssemblerParser.CODE;

	private int getIntegerConstant(Token constToken) {
		switch (constToken.getType()) {
		case AssemblerParser.INT: {
			return Integer.parseInt(constToken.getText());
		}
		case AssemblerParser.HEX: {
			return Util.parseHex(constToken.getText().substring(2));
		}
		default:
			String msg = String.format("getIntegerConstant(%s) - unsupported token type",
					AssemblerParser.tokenNames[constToken.getType()]);
			throw new RuntimeException(msg);
		}
	}

	@Override
	public void startSegment(Token segmentType) {
		currentSegment = segmentType.getType();
	}

	@Override
	public void instruction0(Token instruction, Token operand) {
		source.addInstruction0(instruction.getLine(), instruction.getText());
	}

	@Override
	public void instruction1(Token instruction, Token operand) {
		int line = instruction.getLine();
		String instrName = instruction.getText();
		switch (operand.getType()) {
		case AssemblerParser.ID: {
			source.addInstructionVariable(line, instrName, operand.getText());
			break;
		}
		case AssemblerParser.LID: {
			source.addInstructionLabel(line, instrName, operand.getText());
			break;
		}
		case AssemblerParser.SID: {
			source.addInstructionSyscall(line, instrName, operand.getText());
			break;
		}
		case AssemblerParser.INT: {
			Integer x = Integer.parseInt(operand.getText());
			source.addInstructionConstant(line, instrName, x);
			break;
		}
		case AssemblerParser.HEX: {
			Integer x = Util.parseHex(operand.getText().substring(2));
			source.addInstructionConstant(line, instrName, x);
			break;
		}
		case AssemblerParser.FLOAT: {
			Float f = Float.parseFloat(operand.getText());
			source.addInstructionConstant(line, instrName, f);
			break;
		}
		case AssemblerParser.STRING: {
			source.addInstructionConstant(line, instrName, operand.getText());
			break;
		}
		case AssemblerParser.TRUE: {
			source.addInstructionConstant(line, instrName, true);
			break;
		}
		case AssemblerParser.FALSE: {
			source.addInstructionConstant(line, instrName, false);
			break;
		}
		default:
			String msg = String.format("instruction1(%s, %s) - unsupported operand type", instruction.getText(),
					AssemblerParser.tokenNames[operand.getType()]);
			throw new RuntimeException(msg);
		}
	}

	@Override
	public void label(Token label, Token semi) {
		source.addLabel(label.getLine(), label.getText());
	}

	@Override
	public void variable(Token name, Token size) {
		if (this.currentSegment == AssemblerLexer.SHARED) {
			source.addGlobal(name.getLine(), name.getText(), getIntegerConstant(size), true);
		} else if (this.currentSegment == AssemblerLexer.INSTANCE) {
			source.addGlobal(name.getLine(), name.getText(), getIntegerConstant(size), false);
		} else {
			erlog.append(AsmErrs.VARIABLE_LOCATION, name.getLine(), "variable %s not inside any variable segment",
					name.getText());
		}

	}

	@Override
	public TextParam param(Token name, Token size) {
		if (size == null) {
			// default size of variables is 1 word
			return new TextParam(name.getText(), 1);
		} else {
			return new TextParam(name.getText(), getIntegerConstant(size));
		}
	}

	@Override
	public void function(Token func, List<TextParam> args, List<TextParam> locals, Token retSize) {
		TextParam[] a = new TextParam[0];
		TextParam[] b = new TextParam[0];
		if (args != null) {
			a = args.toArray(new TextParam[0]);
		}
		if (locals != null) {
			b = locals.toArray(new TextParam[0]);
		}
		if (retSize == null) {
			// default return size of functions is zero words
			source.addFunction(func.getLine(), func.getText(), a, b, 0);
		} else {
			source.addFunction(func.getLine(), func.getText(), a, b, getIntegerConstant(retSize));
		}
	}

}
