package cohadar.pascal.symtab.types;

import org.antlr.runtime.tree.CommonTree;

public class TypeRange extends AbstractType {

	private final int low;
	private final int high;

	public static String formatName(int low, int high) {
		return String.format("%d..%d", low, high);
	}

	TypeRange(CommonTree node, int low, int high) {
		super(node, formatName(low, high));
		this.low = low;
		this.high = high;
	}

	public int getLow() {
		return low;
	}

	public int getHigh() {
		return high;
	}

	public int getRange() {
		return (high - low + 1);
	}

	@Override
	public int getSize() {
		return 1; // same size as integer
	}

	@Override
	public Category getCategory() {
		return Category.INTEGER;
	}

}
