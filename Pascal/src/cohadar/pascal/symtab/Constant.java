package cohadar.pascal.symtab;

import cohadar.pascal.symtab.types.BuiltIn;

public class Constant {
	public static final Constant ZERO = new Constant(0);
	public static final Constant ONE = new Constant(1);
	public static final Constant TRUE = new Constant(true);
	public static final Constant FALSE = new Constant(false);

	protected final IType type;

	private final Object value;
	private final Integer ivalue;
	private final Float rvalue;
	private final String svalue;
	private final Boolean bvalue;

	public Constant(Object value) {
		this.value = value;
		if (value instanceof Integer) {
			type = BuiltIn.INTEGER;
			ivalue = (Integer) value;
			rvalue = null;
			svalue = null;
			bvalue = null;
		} else if (value instanceof Float) {
			type = BuiltIn.REAL;
			ivalue = null;
			rvalue = (Float) value;
			svalue = null;
			bvalue = null;
		} else if (value instanceof String) {
			type = BuiltIn.STRING;
			ivalue = null;
			rvalue = null;
			svalue = (String) value;
			bvalue = null;
		} else if (value instanceof Boolean) {
			type = BuiltIn.BOOLEAN;
			ivalue = null;
			rvalue = null;
			svalue = null;
			bvalue = (Boolean) value;
		} else {
			throw new RuntimeException("unsupported constant type: " + value);
		}
	}

	public IType getType() {
		return type;
	}

	public Object getValue() {
		return value;
	}

	@Override
	public String toString() {
		return String.format("<%s='%s'>", type.toString(), getValue());
	}

	public Integer getIntegerValue() {
		return ivalue;
	}

	public Constant negative() {
		if (ivalue != null) {
			return new Constant(-ivalue);
		} else if (rvalue != null) {
			return new Constant(-rvalue);
		} else {
			return null;
		}
	}

	public Constant not() {
		if (bvalue != null) {
			return b2c(!bvalue);
		}
		return null;
	}

	public Constant plus(Constant that) {
		if (this.ivalue != null) {
			if (that.ivalue != null) {
				return new Constant(this.ivalue + that.ivalue);
			}
			if (that.rvalue != null) {
				return new Constant(this.ivalue + that.rvalue);
			}
		}
		if (this.rvalue != null) {
			if (that.ivalue != null) {
				return new Constant(this.rvalue + that.ivalue);
			}
			if (that.rvalue != null) {
				return new Constant(this.rvalue + that.rvalue);
			}
		}
		return null;
	}

	public Constant minus(Constant that) {
		if (this.ivalue != null) {
			if (that.ivalue != null) {
				return new Constant(this.ivalue - that.ivalue);
			}
			if (that.rvalue != null) {
				return new Constant(this.ivalue - that.rvalue);
			}
		}
		if (this.rvalue != null) {
			if (that.ivalue != null) {
				return new Constant(this.rvalue - that.ivalue);
			}
			if (that.rvalue != null) {
				return new Constant(this.rvalue - that.rvalue);
			}
		}
		return null;
	}

	public Constant star(Constant that) {
		if (this.ivalue != null) {
			if (that.ivalue != null) {
				return new Constant(this.ivalue * that.ivalue);
			}
			if (that.rvalue != null) {
				return new Constant(this.ivalue * that.rvalue);
			}
		}
		if (this.rvalue != null) {
			if (that.ivalue != null) {
				return new Constant(this.rvalue * that.ivalue);
			}
			if (that.rvalue != null) {
				return new Constant(this.rvalue * that.rvalue);
			}
		}
		return null;
	}

	public Constant div(Constant that) {
		if (this.ivalue != null) {
			if (that.ivalue != null) {
				return new Constant(this.ivalue / that.ivalue);
			}
		}
		return null;
	}

	public Constant mod(Constant that) {
		if (this.ivalue != null) {
			if (that.ivalue != null) {
				return new Constant(this.ivalue % that.ivalue);
			}
		}
		return null;
	}

	private Constant b2c(Boolean ret) {
		if (ret == null) {
			return null;
		} else {
			if (ret == true) {
				return Constant.TRUE;
			} else {
				return Constant.FALSE;
			}
		}
	}

	public Constant lt(Constant that) {
		Boolean ret = null;
		if (this.ivalue != null) {
			if (that.ivalue != null) {
				ret = (this.ivalue < that.ivalue);
			}
			if (that.rvalue != null) {
				ret = (this.ivalue < that.rvalue);
			}
		}
		if (this.rvalue != null) {
			if (that.ivalue != null) {
				ret = (this.rvalue < that.ivalue);
			}
			if (that.rvalue != null) {
				ret = (this.rvalue < that.rvalue);
			}
		}
		return b2c(ret);
	}

	public Constant le(Constant that) {
		Boolean ret = null;
		if (this.ivalue != null) {
			if (that.ivalue != null) {
				ret = (this.ivalue <= that.ivalue);
			}
			if (that.rvalue != null) {
				ret = (this.ivalue <= that.rvalue);
			}
		}
		if (this.rvalue != null) {
			if (that.ivalue != null) {
				ret = (this.rvalue <= that.ivalue);
			}
			if (that.rvalue != null) {
				ret = (this.rvalue <= that.rvalue);
			}
		}
		return b2c(ret);
	}

	public Constant gt(Constant that) {
		Boolean ret = null;
		if (this.ivalue != null) {
			if (that.ivalue != null) {
				ret = (this.ivalue > that.ivalue);
			}
			if (that.rvalue != null) {
				ret = (this.ivalue > that.rvalue);
			}
		}
		if (this.rvalue != null) {
			if (that.ivalue != null) {
				ret = (this.rvalue > that.ivalue);
			}
			if (that.rvalue != null) {
				ret = (this.rvalue > that.rvalue);
			}
		}
		return b2c(ret);
	}

	public Constant ge(Constant that) {
		Boolean ret = null;
		if (this.ivalue != null) {
			if (that.ivalue != null) {
				ret = (this.ivalue >= that.ivalue);
			}
			if (that.rvalue != null) {
				ret = (this.ivalue >= that.rvalue);
			}
		}
		if (this.rvalue != null) {
			if (that.ivalue != null) {
				ret = (this.rvalue >= that.ivalue);
			}
			if (that.rvalue != null) {
				ret = (this.rvalue >= that.rvalue);
			}
		}
		return b2c(ret);
	}

	public Constant equal(Constant that) {
		Boolean ret = null;
		if (this.ivalue != null) {
			if (that.ivalue != null) {
				ret = (this.ivalue == that.ivalue);
			}
			if (that.rvalue != null) {
				ret = ((float) this.ivalue == that.rvalue);
			}
		}
		if (this.rvalue != null) {
			if (that.ivalue != null) {
				ret = (this.rvalue == (float) that.ivalue);
			}
			if (that.rvalue != null) {
				ret = (this.rvalue == that.rvalue);
			}
		}
		if (ret == null) {
			ret = this.value.equals(that.value);
		}
		return b2c(ret);
	}

	public Constant not_equal(Constant that) {
		Boolean ret = null;
		if (this.ivalue != null) {
			if (that.ivalue != null) {
				ret = (this.ivalue != that.ivalue);
			}
			if (that.rvalue != null) {
				ret = ((float) this.ivalue != that.rvalue);
			}
		}
		if (this.rvalue != null) {
			if (that.ivalue != null) {
				ret = (this.rvalue != (float) that.ivalue);
			}
			if (that.rvalue != null) {
				ret = (this.rvalue != that.rvalue);
			}
		}
		if (ret == null) {
			ret = !this.value.equals(that.value);
		}
		return b2c(ret);
	}

	public Constant and(Constant that) {
		if ((this.bvalue != null) && (that.bvalue != null)) {
			return b2c(this.bvalue && that.bvalue);
		}
		if ((this.ivalue != null) && (that.ivalue != null)) {
			return new Constant(this.ivalue & that.ivalue);
		}
		return null;
	}

	public Constant or(Constant that) {
		if ((this.bvalue != null) && (that.bvalue != null)) {
			return b2c(this.bvalue || that.bvalue);
		}
		if ((this.ivalue != null) && (that.ivalue != null)) {
			return new Constant(this.ivalue | that.ivalue);
		}
		return null;
	}

	public Constant xor(Constant that) {
		if ((this.bvalue != null) && (that.bvalue != null)) {
			return b2c(this.bvalue != that.bvalue);
		}
		if ((this.ivalue != null) && (that.ivalue != null)) {
			return new Constant(this.ivalue ^ that.ivalue);
		}
		return null;
	}
}
