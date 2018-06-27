package cohadar.pascal.grammar;

import org.antlr.runtime.CharStream;

public interface ICharStream extends CharStream {
	// fix dotdot lexing problems
	void prepare();
}
