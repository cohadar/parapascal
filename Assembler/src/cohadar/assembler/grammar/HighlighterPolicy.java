package cohadar.assembler.grammar;

import java.util.List;

import org.antlr.runtime.Token;

import cohadar.assembler.code.TextParam;

// Define the functionality required by the parser for code generation
public class HighlighterPolicy implements IParserPolicy {

	private MyParser parser;

	// default program segment is code segment!
	private int currentSegment = AssemblerParser.CODE;

	public void reset(MyParser parser) {
		this.parser = parser;
		this.currentSegment = AssemblerParser.CODE;
	}

	@Override
	public void startSegment(Token segmentType) {
		currentSegment = segmentType.getType();
	}

	@Override
	public void instruction0(Token instruction, Token operand) {
		if (currentSegment != AssemblerParser.CODE) {
			String msg = String.format("instruction %s outside .CODE segment", instruction.getText().toUpperCase());
			parser.emitErrorMessage(msg);
			instruction.setType(Token.INVALID_TOKEN_TYPE);
			return;
		}
		if (operand != null) {
			operand.setType(Token.INVALID_TOKEN_TYPE);
			String msg = String.format("instruction %s has surplus operand", instruction.getText().toUpperCase());
			parser.emitErrorMessage(msg);
			instruction.setType(Token.INVALID_TOKEN_TYPE);
		}
	}

	@Override
	public void instruction1(Token instruction, Token operand) {
		if (currentSegment != AssemblerParser.CODE) {
			String msg = String.format("instruction %s outside .CODE segment", instruction.getText().toUpperCase());
			parser.emitErrorMessage(msg);
			instruction.setType(Token.INVALID_TOKEN_TYPE);
			return;
		}
		if (operand == null) {
			instruction.setType(Token.INVALID_TOKEN_TYPE);
			String msg = String.format("instruction %s is missing an operand", instruction.getText().toUpperCase());
			parser.emitErrorMessage(msg);
			instruction.setType(Token.INVALID_TOKEN_TYPE);
		}
	}

	@Override
	public void label(Token label, Token semi) {
		if (currentSegment != AssemblerParser.CODE) {
			String msg = String.format("label %s outside .CODE segment", label.getText().toUpperCase());
			parser.emitErrorMessage(msg);
			label.setType(Token.INVALID_TOKEN_TYPE);
			return;
		}
		if (semi == null) {
			label.setType(Token.INVALID_TOKEN_TYPE);
			String msg = String.format("label %s is missing a ':'", label.getText().toUpperCase());
			parser.emitErrorMessage(msg);
			label.setType(Token.INVALID_TOKEN_TYPE);
		}
	}

	@Override
	public void variable(Token name, Token initValue) {
		if ((currentSegment == AssemblerParser.CODE)) {
			String msg = String.format("variable %s cannot be declared inside .CODE segment", name.getText()
					.toUpperCase());
			parser.emitErrorMessage(msg);
			name.setType(Token.INVALID_TOKEN_TYPE);
			return;
		}
	}

	@Override
	public void function(Token func, List<TextParam> args, List<TextParam> locals, Token retSize) {
		if (currentSegment != AssemblerParser.CODE) {
			String msg = String.format("function %s outside .CODE segment", func.getText().toUpperCase());
			parser.emitErrorMessage(msg);
			func.setType(Token.INVALID_TOKEN_TYPE);
			return;
		}
	}

	@Override
	public TextParam param(Token name, Token size) {
		return null;
	}

}
