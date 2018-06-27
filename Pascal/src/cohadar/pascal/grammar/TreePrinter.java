package cohadar.pascal.grammar;

import java.util.Stack;

import org.antlr.runtime.tree.Tree;

public class TreePrinter {
	private static Stack<Boolean> stack = new Stack<Boolean>();
	private static String[] tokenNames;

	private static String getIndent() {
		String ret = "";
		if (!stack.isEmpty()) {
			Boolean temp = stack.pop();
			for (Boolean b : stack) {
				if (b) {
					ret += " |   ";
				} else {
					ret += "     ";
				}
			}
			stack.push(temp);
			ret += " +-- ";
		}

		return ret;
	}

	private static String toString(Tree t) {
		if (t.getText().equalsIgnoreCase(tokenNames[t.getType()])) {
			return String.format("%s<%s>\n", getIndent(), tokenNames[t.getType()]);
		} else {
			return String.format("%s<%s='%s'>\n", getIndent(), tokenNames[t.getType()], t.getText());
		}
	}

	public static String toStringTree(Tree t) {
		if (t.getChildCount() == 0) {
			return toString(t);
		}
		StringBuffer buf = new StringBuffer();
		if (!t.isNil()) {
			buf.append(toString(t));
		}

		for (int i = 0; i < t.getChildCount(); i++) {
			Tree sub = t.getChild(i);
			stack.push(i != (t.getChildCount() - 1));
			buf.append(toStringTree(sub));
			stack.pop();
		}
		return buf.toString();
	}

	public static void setTokenNames(String[] tokenNames) {
		TreePrinter.tokenNames = tokenNames;
	}
}
