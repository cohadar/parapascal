package cohadar.pascal.symtab.types;


class TypeBasic extends AbstractType {

	private final int size;
	private final Category code;

	TypeBasic(String name, int size, Category code) {
		super(null, name);
		this.size = size;
		this.code = code;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public Category getCategory() {
		return code;
	}

}