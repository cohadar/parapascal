package cohadar.interpreter.instructions;

import java.util.HashMap;
import java.util.Map;

import cohadar.interpreter.instructions.arithmetic.ADD;
import cohadar.interpreter.instructions.arithmetic.DEC;
import cohadar.interpreter.instructions.arithmetic.DIV;
import cohadar.interpreter.instructions.arithmetic.INC;
import cohadar.interpreter.instructions.arithmetic.MOD;
import cohadar.interpreter.instructions.arithmetic.MUL;
import cohadar.interpreter.instructions.arithmetic.NEG;
import cohadar.interpreter.instructions.arithmetic.SUB;
import cohadar.interpreter.instructions.arithmeticf.FADD;
import cohadar.interpreter.instructions.arithmeticf.FDEC;
import cohadar.interpreter.instructions.arithmeticf.FDIV;
import cohadar.interpreter.instructions.arithmeticf.FINC;
import cohadar.interpreter.instructions.arithmeticf.FMOD;
import cohadar.interpreter.instructions.arithmeticf.FMUL;
import cohadar.interpreter.instructions.arithmeticf.FNEG;
import cohadar.interpreter.instructions.arithmeticf.FSUB;
import cohadar.interpreter.instructions.arithmeticf.I2F;
import cohadar.interpreter.instructions.comparison.EQ;
import cohadar.interpreter.instructions.comparison.GT;
import cohadar.interpreter.instructions.comparison.GTE;
import cohadar.interpreter.instructions.comparison.LT;
import cohadar.interpreter.instructions.comparison.LTE;
import cohadar.interpreter.instructions.comparison.NEQ;
import cohadar.interpreter.instructions.comparisonf.FEQ;
import cohadar.interpreter.instructions.comparisonf.FGT;
import cohadar.interpreter.instructions.comparisonf.FGTE;
import cohadar.interpreter.instructions.comparisonf.FLT;
import cohadar.interpreter.instructions.comparisonf.FLTE;
import cohadar.interpreter.instructions.comparisonf.FNEQ;
import cohadar.interpreter.instructions.logic.AND;
import cohadar.interpreter.instructions.logic.NOT;
import cohadar.interpreter.instructions.logic.OR;
import cohadar.interpreter.instructions.logic.XOR;
import cohadar.interpreter.instructions.memory.ADDR;
import cohadar.interpreter.instructions.memory.ALOAD;
import cohadar.interpreter.instructions.memory.ASTORE;
import cohadar.interpreter.instructions.memory.BLOAD;
import cohadar.interpreter.instructions.memory.BSTORE;
import cohadar.interpreter.instructions.memory.INDEX;
import cohadar.interpreter.instructions.memory.LOAD;
import cohadar.interpreter.instructions.memory.RANGE;
import cohadar.interpreter.instructions.memory.STORE;
import cohadar.interpreter.instructions.programflow.BR;
import cohadar.interpreter.instructions.programflow.BREAK;
import cohadar.interpreter.instructions.programflow.BRNZ;
import cohadar.interpreter.instructions.programflow.BRZ;
import cohadar.interpreter.instructions.programflow.CALL;
import cohadar.interpreter.instructions.programflow.EXIT;
import cohadar.interpreter.instructions.programflow.FORK;
import cohadar.interpreter.instructions.programflow.JOIN;
import cohadar.interpreter.instructions.programflow.RET;
import cohadar.interpreter.instructions.programflow.SYSCALL;
import cohadar.interpreter.instructions.stack.CONST;
import cohadar.interpreter.instructions.stack.DIS;
import cohadar.interpreter.instructions.stack.DUP;
import cohadar.interpreter.instructions.stack.NOP;
import cohadar.interpreter.instructions.stack.SWAP;
import cohadar.interpreter.program.AsmFunction;
import cohadar.interpreter.program.AsmInstruction;
import cohadar.interpreter.program.AsmLabel;
import cohadar.interpreter.program.AsmVariable;
import cohadar.interpreter.system.CCSystem;
import cohadar.interpreter.system.SystemFunction;

public class InstructionFactory {
	private static Map<String, AsmInstruction> map0;

	public static AsmInstruction _add = new ADD();
	public static AsmInstruction _sub = new SUB();
	public static AsmInstruction _mul = new MUL();
	public static AsmInstruction _div = new DIV();
	public static AsmInstruction _mod = new MOD();
	public static AsmInstruction _inc = new INC();
	public static AsmInstruction _dec = new DEC();
	public static AsmInstruction _neg = new NEG();
	public static AsmInstruction _eq = new EQ();
	public static AsmInstruction _neq = new NEQ();
	public static AsmInstruction _lt = new LT();
	public static AsmInstruction _lte = new LTE();
	public static AsmInstruction _gt = new GT();
	public static AsmInstruction _gte = new GTE();
	public static AsmInstruction _and = new AND();
	public static AsmInstruction _or = new OR();
	public static AsmInstruction _xor = new XOR();
	public static AsmInstruction _not = new NOT();
	public static AsmInstruction _load = new LOAD();
	public static AsmInstruction _store = new STORE();
	public static AsmInstruction _aload = new ALOAD();
	public static AsmInstruction _astore = new ASTORE();
	public static AsmInstruction _bload = new BLOAD();
	public static AsmInstruction _bstore = new BSTORE();
	public static AsmInstruction _join = new JOIN();
	public static AsmInstruction _ret = new RET();
	public static AsmInstruction _dup = new DUP();
	public static AsmInstruction _nop = new NOP();
	public static AsmInstruction _swap = new SWAP();
	public static AsmInstruction _i2f = new I2F();
	public static AsmInstruction _fadd = new FADD();
	public static AsmInstruction _fdec = new FDEC();
	public static AsmInstruction _fdiv = new FDIV();
	public static AsmInstruction _finc = new FINC();
	public static AsmInstruction _fmod = new FMOD();
	public static AsmInstruction _fmul = new FMUL();
	public static AsmInstruction _fneg = new FNEG();
	public static AsmInstruction _fsub = new FSUB();
	public static AsmInstruction _feq = new FEQ();
	public static AsmInstruction _fneq = new FNEQ();
	public static AsmInstruction _flt = new FLT();
	public static AsmInstruction _flte = new FLTE();
	public static AsmInstruction _fgt = new FGT();
	public static AsmInstruction _fgte = new FGTE();
	public static AsmInstruction _range = new RANGE();
	public static AsmInstruction _index = new INDEX();

	// ============
	public static AsmInstruction _debug = new SYSCALL(CCSystem.debug);
	public static AsmInstruction _exit0 = new EXIT(0);

	// instructions without argument can be reused
	public static AsmInstruction create(String instrName) {
		if (map0 == null) {
			map0 = new HashMap<String, AsmInstruction>();
			map0.put("add", _add);
			map0.put("sub", _sub);
			map0.put("mul", _mul);
			map0.put("div", _div);
			map0.put("mod", _mod);
			map0.put("inc", _inc);
			map0.put("dec", _dec);
			map0.put("neg", _neg);
			map0.put("eq", _eq);
			map0.put("neq", _neq);
			map0.put("lt", _lt);
			map0.put("lte", _lte);
			map0.put("gt", _gt);
			map0.put("gte", _gte);
			map0.put("and", _and);
			map0.put("or", _or);
			map0.put("xor", _xor);
			map0.put("not", _not);
			map0.put("load", _load);
			map0.put("store", _store);
			map0.put("aload", _aload);
			map0.put("astore", _astore);
			map0.put("bload", _bload);
			map0.put("bstore", _bstore);
			map0.put("join", _join);
			map0.put("ret", _ret);
			map0.put("dup", _dup);
			map0.put("nop", _nop);
			map0.put("swap", _swap);
			map0.put("i2f", _i2f);
			map0.put("fadd", _fadd);
			map0.put("fdec", _fdec);
			map0.put("fdiv", _fdiv);
			map0.put("finc", _finc);
			map0.put("fmod", _fmod);
			map0.put("fmul", _fmul);
			map0.put("fneg", _fneg);
			map0.put("fsub", _fsub);
			map0.put("feq", _feq);
			map0.put("fneq", _fneq);
			map0.put("flt", _flt);
			map0.put("flte", _flte);
			map0.put("fgt", _fgt);
			map0.put("fgte", _fgte);
			map0.put("range", _range);
			map0.put("index", _index);
		}

		return map0.get(instrName);
	}

	public static AsmInstruction create(String instrName, AsmLabel label) {
		if ("br".equals(instrName)) {
			return new BR(label);
		}
		if ("brz".equals(instrName) || "brf".equals(instrName)) {
			return new BRZ(label);
		}
		if ("brnz".equals(instrName) || "brt".equals(instrName)) {
			return new BRNZ(label);
		}
		if ("fork".equals(instrName)) {
			return new FORK(label);
		}
		if ("call".equals(instrName)) {
			return new CALL((AsmFunction) label);
		}
		return null;
	}

	public static AsmInstruction create(String instrName, SystemFunction sfunc) {
		if ("syscall".equals(instrName)) {
			return new SYSCALL(sfunc);
		}
		return null;
	}

	public static AsmInstruction create(String instrName, AsmVariable var) {
		if ("addr".equals(instrName)) {
			return new ADDR(var);
		}
		return null;
	}

	public static AsmInstruction create(String instrName, int x) {
		if ("const".equals(instrName)) {
			return new CONST(x);
		}
		if ("dis".equals(instrName)) {
			return new DIS(x);
		}
		if ("exit".equals(instrName)) {
			return new EXIT(x);
		}
		return null;
	}

	public static AsmInstruction createBreakpoint(int sourceLine) {
		return new BREAK(sourceLine);
	}

}
