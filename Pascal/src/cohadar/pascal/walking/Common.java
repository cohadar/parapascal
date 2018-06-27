package cohadar.pascal.walking;

import org.antlr.runtime.tree.CommonTree;

import cohadar.pascal.grammar.BParser;

public class Common {
	private static int[] LOOPS = { BParser.FOR, BParser.WHILE, BParser.REPEAT, BParser.COFOR };

	public static CommonTree getBreakParent(CommonTree _break) {
		CommonTree ret = null;
		for (int i = 0; i < LOOPS.length; i++) {
			ret = (CommonTree) _break.getAncestor(LOOPS[i]);
			if (ret != null) {
				break;
			}
		}
		return ret;
	}
}
