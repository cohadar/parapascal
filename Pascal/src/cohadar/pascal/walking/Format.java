package cohadar.pascal.walking;

public class Format {
	private static final StringBuilder sb = new StringBuilder();

	private static String ins0(String mnemonic) {
		sb.append('\t');
		sb.append(mnemonic);
		sb.append('\n');
		return gets();
	}

	private static String ins1(String mnemonic, String op) {
		sb.append('\t');
		sb.append(mnemonic);
		for (int i = 9 - mnemonic.length(); i > 0; i--) {
			sb.append(' ');
		}
		sb.append(op);
		sb.append('\n');
		return gets();
	}

	public static String add() {
		return ins0("add");
	}

	public static String sub() {
		return ins0("sub");
	}

	public static String mul() {
		return ins0("mul");
	}

	public static String div() {
		return ins0("div");
	}

	public static String mod() {
		return ins0("mod");
	}

	public static String inc() {
		return ins0("inc");
	}

	public static String dec() {
		return ins0("dec");
	}

	public static String neg() {
		return ins0("neg");
	}

	public static String eq() {
		return ins0("eq");
	}

	public static String neq() {
		return ins0("neq");
	}

	public static String lt() {
		return ins0("lt");
	}

	public static String lte() {
		return ins0("lte");
	}

	public static String gt() {
		return ins0("gt");
	}

	public static String gte() {
		return ins0("gte");
	}

	public static String and() {
		return ins0("and");
	}

	public static String or() {
		return ins0("or");
	}

	public static String xor() {
		return ins0("xor");
	}

	public static String not() {
		return ins0("not");
	}

	public static String load() {
		return ins0("load");
	}

	public static String store() {
		return ins0("store");
	}

	public static String aload() {
		return ins0("aload");
	}

	public static String bstore() {
		return ins0("bstore");
	}

	public static String bload() {
		return ins0("bload");
	}

	public static String astore() {
		return ins0("astore");
	}

	public static String join() {
		return ins0("join");
	}

	public static String ret() {
		return ins0("ret");
	}

	public static String dup() {
		return ins0("dup");
	}

	public static String nop() {
		return ins0("nop");
	}

	public static String swap() {
		return ins0("swap");
	}

	public static String i2f() {
		return ins0("i2f");
	}

	public static String ffadd() {
		return ins0("ffadd");
	}

	public static String fdec() {
		return ins0("fdec");
	}

	public static String fdiv() {
		return ins0("fdiv");
	}

	public static String finc() {
		return ins0("finc");
	}

	public static String fmod() {
		return ins0("fmod");
	}

	public static String fmul() {
		return ins0("fmul");
	}

	public static String fneg() {
		return ins0("fneg");
	}

	public static String fsub() {
		return ins0("fsub");
	}

	public static String feq() {
		return ins0("feq");
	}

	public static String fneq() {
		return ins0("fneq");
	}

	public static String flt() {
		return ins0("flt");
	}

	public static String flte() {
		return ins0("flte");
	}

	public static String fgt() {
		return ins0("fgt");
	}

	public static String fgte() {
		return ins0("fgte");
	}

	public static String range() {
		return ins0("range");
	}

	public static String index() {
		return ins0("index");
	}

	public static String addr(Object op) {
		return ins1("addr", op.toString());
	}

	public static String exit(Object op) {
		return ins1("exit", op.toString());
	}

	public static String _const(Object op) {
		return ins1("const", op.toString());
	}

	public static String startFork(int forkIndex) {
		String ret = ins1("fork", String.format("@forkStart_%04X", forkIndex));
		ret += Format.ins1("br", String.format("@forkEnd_%04X", forkIndex));
		ret += String.format("\t@forkStart_%04X:\n", forkIndex);
		return ret;
	}

	public static String endFork(int forkIndex) {
		String ret = Format.exit(0);
		ret += String.format("\t@forkEnd_%04X:\n", forkIndex);
		return ret;
	}

	public static String syscall(String funcName) {
		return ins1("syscall", "%" + funcName);
	}

	public static String call(String funcName) {
		return ins1("call", "@" + funcName);
	}

	public static String br(int labelIndex) {
		return ins1("br", String.format("@%04X", labelIndex));
	}

	public static String brf(int labelIndex) {
		return ins1("brf", String.format("@%04X", labelIndex));
	}

	public static String brt(int labelIndex) {
		return ins1("brt", String.format("@%04X", labelIndex));
	}

	public static String forkLabel(int forkIndex) {
		sb.append('@');
		sb.append(String.format("fork_%04X", forkIndex));
		sb.append(":\n");
		return gets();
	}

	public static String endforkLabel(int forkIndex) {
		sb.append('@');
		sb.append(String.format("endFork_%04X", forkIndex));
		sb.append(":\n");
		return gets();
	}

	public static String label(int index) {
		sb.append('@');
		sb.append(String.format("%04X", index));
		sb.append(":\n");
		return gets();
	}

	public static String comment(String text) {
		sb.append("\t// ");
		sb.append(text);
		sb.append('\n');
		return gets();
	}

	private static String blockStore(String name, boolean byValue, boolean noSuffix, int size) {
		String ret = "";
		if (byValue) {
			if (noSuffix) {
				ret += Format.addr(name);
				ret += Format._const(size);
				ret += Format.bstore();
			} else {
				ret += Format.addr(name);
				ret += Format.add();
				ret += Format._const(size);
				ret += Format.bstore();
			}
		} else {
			if (noSuffix) {
				ret += Format.addr(name);
				ret += Format.load();
				ret += Format._const(size);
				ret += Format.bstore();
			} else {
				ret += Format.addr(name);
				ret += Format.load();
				ret += Format.add();
				ret += Format._const(size);
				ret += Format.bstore();
			}
		}
		return ret;
	}

	public static String variableStore(String name, boolean byValue, boolean noSuffix, int size) {
		if (size > 1) {
			return blockStore(name, byValue, noSuffix, size);
		}
		String ret = "";
		if (byValue) {
			if (noSuffix) {
				ret += Format.addr(name);
				ret += Format.store();
			} else {
				ret += Format.addr(name);
				ret += Format.astore();
			}
		} else {
			if (noSuffix) {
				ret += Format.addr(name);
				ret += Format.load();
				ret += Format.store();
			} else {
				ret += Format.addr(name);
				ret += Format.load();
				ret += Format.astore();
			}
		}
		return ret;
	}

	private static String blockLoad(String name, boolean byValue, boolean noSuffix, int size) {
		String ret = "";
		if (byValue) {
			if (noSuffix) {
				ret += Format.addr(name);
				ret += Format._const(size);
				ret += Format.bload();
			} else {
				ret += Format.addr(name);
				ret += Format.add();
				ret += Format._const(size);
				ret += Format.bload();
			}
		} else {
			if (noSuffix) {
				ret += Format.addr(name);
				ret += Format.load();
				ret += Format._const(size);
				ret += Format.bload();
			} else {
				ret += Format.addr(name);
				ret += Format.load();
				ret += Format.add();
				ret += Format._const(size);
				ret += Format.bload();
			}
		}
		return ret;
	}

	public static String variableLoad(String name, boolean byValue, boolean noSuffix, int size) {
		if (size > 1) {
			return blockLoad(name, byValue, noSuffix, size);
		}
		String ret = "";
		if (byValue) {
			if (noSuffix) {
				ret += Format.addr(name);
				ret += Format.load();
			} else {
				ret += Format.addr(name);
				ret += Format.aload();
			}
		} else {
			if (noSuffix) {
				ret += Format.addr(name);
				ret += Format.load();
				ret += Format.load();
			} else {
				ret += Format.addr(name);
				ret += Format.load();
				ret += Format.aload();
			}
		}
		return ret;
	}

	public static String variableAddr(String name, boolean byValue, boolean noSuffix) {
		String ret = "";
		if (byValue) {
			if (noSuffix) {
				ret += Format.addr(name);
			} else {
				ret += Format.addr(name);
				ret += Format.add();
			}
		} else {
			if (noSuffix) {
				ret += Format.addr(name);
				ret += Format.load();
			} else {
				ret += Format.addr(name);
				ret += Format.load();
				ret += Format.add();
			}
		}
		return ret;
	}

	private static String gets() {
		String ret = sb.toString();
		sb.setLength(0);
		return ret;
	}

	public static String regionName(Integer id) {
		return String.format("_region_sem_%04X", id);
	}

}
