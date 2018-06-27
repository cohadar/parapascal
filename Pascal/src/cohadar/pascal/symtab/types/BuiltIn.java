package cohadar.pascal.symtab.types;

import java.util.ArrayList;
import java.util.List;

import cohadar.pascal.symtab.IType;
import cohadar.pascal.symtab.SymbolTable;

public class BuiltIn {
	private static final List<String> predefinedFunctions = new ArrayList<String>();
	private static final List<String> varargFunctions = new ArrayList<String>();

	static {
		predefinedFunctions.add("init");
		predefinedFunctions.add("signal");
		predefinedFunctions.add("wait");

		predefinedFunctions.add("sleep");

		predefinedFunctions.add("write");
		predefinedFunctions.add("writeln");
		predefinedFunctions.add("debug");

		predefinedFunctions.add("abs");
		predefinedFunctions.add("sin");
		predefinedFunctions.add("cos");
		predefinedFunctions.add("arctan");
		predefinedFunctions.add("ln");
		predefinedFunctions.add("exp");
		predefinedFunctions.add("sqrt");
		predefinedFunctions.add("sqr");
		predefinedFunctions.add("trunc");
		predefinedFunctions.add("round");
		predefinedFunctions.add("random");
		// ---
		varargFunctions.add("write");
		varargFunctions.add("writeln");
		varargFunctions.add("debug");
	}

	public static boolean isPredefinedFunction(String name) {
		return predefinedFunctions.contains(name);
	}

	public static boolean isVarargFunction(String name) {
		return varargFunctions.contains(name);
	}

	public static final IType INTEGER = new TypeBasic("integer", 1, Category.INTEGER);
	public static final IType BOOLEAN = new TypeBasic("boolean", 1, Category.BOOLEAN);
	public static final IType REAL = new TypeBasic("real", 1, Category.REAL);
	public static final IType STRING = new TypeBasic("string", 256, Category.STRING);
	public static final IType SEMAPHORE = new TypeBasic("semaphore", 1, Category.SEMAPHORE);

	public static final IType VOID = new TypeBasic("void", 0, Category.VOID); // pseudo

	public static void initSymbolTable(SymbolTable symtab) {
		symtab.defineType(BuiltIn.INTEGER);
		symtab.defineType(BuiltIn.BOOLEAN);
		symtab.defineType(BuiltIn.REAL);
		symtab.defineType(BuiltIn.STRING);
		symtab.defineType(BuiltIn.SEMAPHORE);

		// first argument is reference
		TypeFunction func = new TypeFunction("init", "SEM_INIT", BuiltIn.VOID, new IType[] { BuiltIn.SEMAPHORE,
				BuiltIn.INTEGER }, new boolean[] { true, false });
		symtab.defineType(func);

		func = new TypeFunction("signal", "SEM_SIGNAL", BuiltIn.VOID, new IType[] { BuiltIn.SEMAPHORE });
		symtab.defineType(func);

		func = new TypeFunction("wait", "SEM_WAIT", BuiltIn.VOID, new IType[] { BuiltIn.SEMAPHORE });
		symtab.defineType(func);

		func = new TypeFunction("sleep", "PROC_SLEEP", BuiltIn.VOID, new IType[] { BuiltIn.INTEGER });
		symtab.defineType(func);

		// next 3 are pseudo-functions
		func = new TypeFunction("write", null, BuiltIn.VOID, null);
		symtab.defineType(func);

		func = new TypeFunction("writeln", null, BuiltIn.VOID, null);
		symtab.defineType(func);

		func = new TypeFunction("debug", null, BuiltIn.VOID, null);
		symtab.defineType(func);

		// math functions
		func = new TypeFunction("abs", "MATH_ABS", BuiltIn.REAL, new IType[] { BuiltIn.REAL });
		symtab.defineType(func);

		func = new TypeFunction("sin", "MATH_SIN", BuiltIn.REAL, new IType[] { BuiltIn.REAL });
		symtab.defineType(func);

		func = new TypeFunction("cos", "MATH_COS", BuiltIn.REAL, new IType[] { BuiltIn.REAL });
		symtab.defineType(func);

		func = new TypeFunction("arctan", "MATH_ARCTAN", BuiltIn.REAL, new IType[] { BuiltIn.REAL });
		symtab.defineType(func);

		func = new TypeFunction("ln", "MATH_LN", BuiltIn.REAL, new IType[] { BuiltIn.REAL });
		symtab.defineType(func);

		func = new TypeFunction("exp", "MATH_EXP", BuiltIn.REAL, new IType[] { BuiltIn.REAL });
		symtab.defineType(func);

		func = new TypeFunction("sqrt", "MATH_SQRT", BuiltIn.REAL, new IType[] { BuiltIn.REAL });
		symtab.defineType(func);

		func = new TypeFunction("sqr", "MATH_SQR", BuiltIn.REAL, new IType[] { BuiltIn.REAL });
		symtab.defineType(func);

		func = new TypeFunction("trunc", "MATH_TRUNC", BuiltIn.INTEGER, new IType[] { BuiltIn.REAL });
		symtab.defineType(func);

		func = new TypeFunction("round", "MATH_ROUND", BuiltIn.INTEGER, new IType[] { BuiltIn.REAL });
		symtab.defineType(func);

		func = new TypeFunction("random", "MATH_IRAND", BuiltIn.INTEGER, new IType[] { BuiltIn.INTEGER });
		symtab.defineType(func);

		// func = new TypeFunction("random", "MATH_RRAND", BuiltIn.REAL, new
		// IType[] {});
		// symtab.defineType(func);

	}

	// SLASH
	public static IType slashResult(IType ta, IType tb) {
		Category a = ta.getCategory();
		Category b = tb.getCategory();
		if (a.isNumber() && b.isNumber()) {
			return REAL;
		} else {
			return VOID; // illegal operation
		}
	}

	// PLUS | MINUS | STAR
	public static IType arithmeticResult(IType ta, IType tb) {
		Category a = ta.getCategory();
		Category b = tb.getCategory();
		if (a.isNumber() && b.isNumber()) {
			if ((a == Category.INTEGER) && (b == Category.INTEGER)) {
				return INTEGER;
			} else {
				return REAL;
			}
		} else {
			return VOID; // illegal operation
		}
	}

	// DIV | MOD
	public static IType divModResult(IType ta, IType tb) {
		Category a = ta.getCategory();
		Category b = tb.getCategory();
		if ((a == Category.INTEGER) && (b == Category.INTEGER)) {
			return INTEGER;
		} else {
			return VOID; // illegal operation
		}
	}

	// LT | LE | GE | GT
	public static IType comparisonResult(IType ta, IType tb) {
		Category a = ta.getCategory();
		Category b = tb.getCategory();
		if (a.isNumber() && b.isNumber()) {
			return BOOLEAN;
		} else {
			return VOID; // illegal operation
		}
	}

	// EQUAL, NOT_EQUAL
	public static IType equalityResult(IType ta, IType tb) {
		Category a = ta.getCategory();
		Category b = tb.getCategory();
		if (a == b) {
			return BOOLEAN;
		} else if (a.isNumber() && b.isNumber()) {
			return BOOLEAN;
		} else {
			return VOID; // illegal operation
		}
	}

	// AND, OR, XOR
	public static IType logicResult(IType ta, IType tb) {
		Category a = ta.getCategory();
		Category b = tb.getCategory();
		if ((a == Category.BOOLEAN) && (b == Category.BOOLEAN)) {
			return BOOLEAN;
		} else if ((a == Category.INTEGER) && (b == Category.INTEGER)) {
			return INTEGER;
		} else {
			return VOID; // illegal operation
		}
	}

	// promote first Type into second one?
	public static boolean promoteFromTo(IType ta, IType tb) {
		Category a = ta.getCategory();
		Category b = tb.getCategory();
		if ((a == Category.INTEGER) && b == Category.REAL) {
			return true;
		}
		return false;
	}

	public static boolean canAssignFromTo(IType ta, IType tb) {
		if (ta == tb) {
			return true;
		} else {
			Category a = ta.getCategory();
			Category b = tb.getCategory();
			if ((a == Category.INTEGER) && b.isNumber()) {
				return true;
			} else {
				return false;
			}
		}
	}
}
