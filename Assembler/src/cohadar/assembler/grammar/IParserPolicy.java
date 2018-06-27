package cohadar.assembler.grammar;

import java.util.List;

import org.antlr.runtime.Token;

import cohadar.assembler.code.TextParam;

public interface IParserPolicy {

	void startSegment(Token segmentType);

	void instruction0(Token instruction, Token operand);

	void instruction1(Token instruction, Token operand);

	void label(Token label, Token semi);

	void function(Token func, List<TextParam> args, List<TextParam> locals, Token retSize);

	void variable(Token name, Token size);

	TextParam param(Token name, Token size);
}
