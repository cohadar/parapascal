package cohadar.pascal.symtab.types;

import org.antlr.runtime.tree.CommonTree;

import cohadar.pascal.symtab.IVariable;
import cohadar.util.Util;

public class TypeRecord extends AbstractType {
	private final IVariable[] fields;
	private final int size;
	private static int nameId = 0;

	public TypeRecord(CommonTree node, IVariable[] fields) {
		super(node, "record#" + (nameId++));
		this.fields = fields;
		int s = 0;
		for (IVariable v : fields) {
			s += v.getType().getSize();
		}
		this.size = s;
	}

	public IVariable resolve(String fieldName) {
		for (IVariable f : fields) {
			if (f.getName().equals(fieldName)) {
				return f;
			}
		}
		return null;
	}

	public int fieldOffset(String fieldName) {
		int offset = 0;
		for (IVariable f : fields) {
			if (f.getName().equals(fieldName)) {
				return offset;
			} else {
				offset += f.getType().getSize();
			}
		}
		throw new RuntimeException(String.format("record %s - unknown field %s", name, fieldName));
	}

	@Override
	public String toString() {
		String a = Util.replicate(", ", fields);
		return String.format("record %s(%s)", getName(), a);
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public Category getCategory() {
		return Category.RECORD;
	}

}
