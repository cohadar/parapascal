package cohadar.interpreter.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import cohadar.interpreter.instructions.InstructionFactory;
import cohadar.interpreter.instructions.stack.CONST;

public class CCProgram {
	protected List<AsmInstruction> lines = new ArrayList<AsmInstruction>();
	protected Map<String, AsmLabel> labels = new HashMap<String, AsmLabel>();
	protected Map<AsmLabel, Integer> labelMap = new HashMap<AsmLabel, Integer>();
	protected Map<Integer, AsmLabel> inversLabelMap = new HashMap<Integer, AsmLabel>();
	protected PointerIndex constantPool = new PointerIndex();

	public int getLabelPosition(AsmLabel label) {
		return labelMap.get(label.getName());
	}

	public void load(CCProgram sub) {
		int size = lines.size();
		for (AsmInstruction line : sub.lines) {
			this.addInstruction(line);
		}
		for (Entry<AsmLabel, Integer> e : sub.labelMap.entrySet()) {
			this.defineLabel(e.getKey(), size + e.getValue());
		}

		this.shared_size += sub.shared_size;
		this.instance_size += sub.instance_size;
	}

	private void defineLabel(AsmLabel label, int position) {
		label.setAddress(position);
		labels.put(label.getName(), label);
		labelMap.put(label, position);
		inversLabelMap.put(position, label);
	}

	/*
	 * static { load(SignalFlow.flow1); load(SignalFlow.flow1_IB_0);
	 * 
	 * }
	 */

	private void print() {
		this.println("\n################<CODE>################\n");
		int i = 0;
		for (AsmInstruction line : lines) {
			if (inversLabelMap.containsKey(i)) {
				this.printf("%s:\n", inversLabelMap.get(i).getName());
			}
			this.printf("%04X:   %s\n", i++, line.toString().replaceAll("\n", " ; "));
		}

		this.println("\n###############<LABELS>###############\n");

		Set<Integer> s = inversLabelMap.keySet();
		Integer[] k = s.toArray(new Integer[0]);
		Arrays.sort(k);
		for (Integer j : k) {
			AsmLabel l = inversLabelMap.get(j);
			this.printf("%02X %s\t; %d\n", j, l.getName(), l.getAddress());
		}

		this.println("\n##############<CONSTANTS>#############\n");
		int c = 0;
		for (int j = 0; j < constantPool.size(); j++) {
			Object x = constantPool.get(j);
			if (x instanceof String) {
				this.printf("[%02d] '%s'\n", c++, x);
			} else {
				this.printf("[%02d] %s\n", c++, x);
			}
		}
	}

	private void println(String string) {
		listing.append(string + '\n');
	}

	private void printf(String string, Object... args) {
		listing.append(String.format(string, args));
	}

	private final StringBuilder listing = new StringBuilder();

	public String getListing() {
		listing.setLength(0);
		print();
		return listing.toString();
	}

	public int size() {
		return lines.size();
	}

	public AsmLabel getLabelOnPos(int pos) {
		return inversLabelMap.get(pos);
	}

	public AsmInstruction getLine(int pos) {
		return lines.get(pos);
	}

	public boolean hasLabel(AsmLabel label) {
		return labelMap.containsKey(label.getName());
	}

	int startPosition = 0;
	private int shared_size = 0;
	private int instance_size = 0;

	public int getStartPosition() {
		return startPosition;
	}

	public void addSharedVariable(int size) {
		shared_size += size;
	}

	public void addInstanceVariable(int size) {
		instance_size += size;
	}

	public int addConstant(Object c) {
		return constantPool.add(c);
	}

	public Object getConstant(int index) {
		return constantPool.get(index);
	}

	public void addInstruction(AsmInstruction next) {
		lines.add(next);
	}

	public void _add() {
		lines.add(InstructionFactory._add);
	}

	public void _sub() {
		lines.add(InstructionFactory._sub);
	}

	public void _mul() {
		lines.add(InstructionFactory._mul);
	}

	public void _div() {
		lines.add(InstructionFactory._div);
	}

	public void _mod() {
		lines.add(InstructionFactory._mod);
	}

	public void _inc() {
		lines.add(InstructionFactory._inc);
	}

	public void _dec() {
		lines.add(InstructionFactory._dec);
	}

	public void _neg() {
		lines.add(InstructionFactory._neg);
	}

	public void _eq() {
		lines.add(InstructionFactory._eq);
	}

	public void _neq() {
		lines.add(InstructionFactory._neq);
	}

	public void _lt() {
		lines.add(InstructionFactory._lt);
	}

	public void _lte() {
		lines.add(InstructionFactory._lte);
	}

	public void _gt() {
		lines.add(InstructionFactory._gt);
	}

	public void _gte() {
		lines.add(InstructionFactory._gte);
	}

	public void _and() {
		lines.add(InstructionFactory._and);
	}

	public void _or() {
		lines.add(InstructionFactory._or);
	}

	public void _xor() {
		lines.add(InstructionFactory._xor);
	}

	public void _not() {
		lines.add(InstructionFactory._not);
	}

	public void _load() {
		lines.add(InstructionFactory._load);
	}

	public void _store() {
		lines.add(InstructionFactory._store);
	}

	public void _aload() {
		lines.add(InstructionFactory._aload);
	}

	public void _astore() {
		lines.add(InstructionFactory._astore);
	}

	public void _bload() {
		lines.add(InstructionFactory._bload);
	}

	public void _bstore() {
		lines.add(InstructionFactory._bstore);
	}

	public void _join() {
		lines.add(InstructionFactory._join);
	}

	public void _ret() {
		lines.add(InstructionFactory._ret);
	}

	public void _dup() {
		lines.add(InstructionFactory._dup);
	}

	public void _nop() {
		lines.add(InstructionFactory._nop);
	}

	public void _swap() {
		lines.add(InstructionFactory._swap);
	}

	public void _i2f() {
		lines.add(InstructionFactory._i2f);
	}

	public void _fadd() {
		lines.add(InstructionFactory._fadd);
	}

	public void _fdec() {
		lines.add(InstructionFactory._fdec);
	}

	public void _fdiv() {
		lines.add(InstructionFactory._fdiv);
	}

	public void _finc() {
		lines.add(InstructionFactory._finc);
	}

	public void _fmod() {
		lines.add(InstructionFactory._fmod);
	}

	public void _fmul() {
		lines.add(InstructionFactory._fmul);
	}

	public void _fneg() {
		lines.add(InstructionFactory._fneg);
	}

	public void _fsub() {
		lines.add(InstructionFactory._fsub);
	}

	public void _feq() {
		lines.add(InstructionFactory._feq);
	}

	public void _fneq() {
		lines.add(InstructionFactory._fneq);
	}

	public void _flt() {
		lines.add(InstructionFactory._flt);
	}

	public void _flte() {
		lines.add(InstructionFactory._flte);
	}

	public void _fgt() {
		lines.add(InstructionFactory._fgt);
	}

	public void _fgte() {
		lines.add(InstructionFactory._fgte);
	}

	public void _range() {
		lines.add(InstructionFactory._range);
	}

	public void _index() {
		lines.add(InstructionFactory._index);
	}

	// ========================

	public void _const(Object c) {
		int x = this.addConstant(c);
		lines.add(new CONST(x));
	}

	public void _debug() {
		lines.add(InstructionFactory._debug);
	}

	public void _exit0() {
		lines.add(InstructionFactory._exit0);
	}

	public void _label(AsmLabel label) {
		defineLabel(label, lines.size());
	}

	// called by CSource
	public void _function(AsmFunction func) {
		_label(func);
		if ("@main".equals(func.getName())) {
			startPosition = lines.size();
		}
	}

	public AsmInstruction[] getCode() {
		return lines.toArray(new AsmInstruction[0]);
	}

	public PointerIndex getPointerIndex() {
		return constantPool.copy();
	}

	public int getSharedSize() {
		return shared_size;
	}

	public int getInstanceSize() {
		return instance_size;
	}

}
