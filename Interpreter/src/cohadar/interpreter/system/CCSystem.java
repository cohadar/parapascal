package cohadar.interpreter.system;

import java.util.ArrayList;
import java.util.List;

public class CCSystem {
	public static SystemFunction debug = new DEBUG();
	public static SystemFunction sem_init = new SEM_INIT();
	public static SystemFunction sem_wait = new SEM_WAIT();
	public static SystemFunction sem_signal = new SEM_SIGNAL();
	public static SystemFunction proc_sleep = new PROC_SLEEP();
	public static SystemFunction print_boolean = new PRINT_BOOLEAN();
	public static SystemFunction print_cref = new PRINT_CREF();
	public static SystemFunction print_real = new PRINT_REAL();
	public static SystemFunction print_integer = new PRINT_INTEGER();
	public static SystemFunction print_nl = new PRINT_NL();
	public static SystemFunction math_abs = new MATH_ABS();
	public static SystemFunction math_sin = new MATH_SIN();
	public static SystemFunction math_cos = new MATH_COS();
	public static SystemFunction math_arctan = new MATH_ARCTAN();
	public static SystemFunction math_ln = new MATH_LN();
	public static SystemFunction math_exp = new MATH_EXP();
	public static SystemFunction math_sqrt = new MATH_SQRT();
	public static SystemFunction math_sqr = new MATH_SQR();
	public static SystemFunction math_trunc = new MATH_TRUNC();
	public static SystemFunction math_round = new MATH_ROUND();
	public static SystemFunction math_irand = new MATH_IRAND();
	public static SystemFunction math_rrand = new MATH_RRAND();

	private static List<SystemFunction> labels = null;

	private static void lazyInit() {
		if (labels == null) {
			labels = new ArrayList<SystemFunction>();
			labels.add(debug);
			labels.add(print_boolean);
			labels.add(print_cref);
			labels.add(print_real);
			labels.add(print_integer);
			labels.add(print_nl);
			labels.add(sem_init);
			labels.add(sem_wait);
			labels.add(sem_signal);
			labels.add(proc_sleep);
			labels.add(math_abs);
			labels.add(math_sin);
			labels.add(math_cos);
			labels.add(math_arctan);
			labels.add(math_ln);
			labels.add(math_exp);
			labels.add(math_sqrt);
			labels.add(math_sqr);
			labels.add(math_trunc);
			labels.add(math_round);
			labels.add(math_irand);
			labels.add(math_rrand);
		}
	}

	public static List<SystemFunction> getSystemFunctions() {
		lazyInit();
		return labels;
	}

	// TODO: optimize with map? (only if number of functions increases a lot)
	public static SystemFunction getSystemFunction(String name) {
		lazyInit();
		for (SystemFunction label : labels) {
			if (label.getName().equals(name)) {
				return label;
			}
		}
		throw new NullPointerException("Unknown system function: " + name);
	}
}
