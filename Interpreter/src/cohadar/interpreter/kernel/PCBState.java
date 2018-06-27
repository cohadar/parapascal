package cohadar.interpreter.kernel;

import java.util.LinkedList;
import java.util.List;

public class PCBState {

	private final List<PCB> pcbs = new LinkedList<PCB>();
	private final String name;

	PCBState(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	void safeAdd(PCB pcb) {
		PCBState old = pcb.getState();
		if (old != null) {
			old.pcbs.remove(pcb);
		}
		pcbs.add(pcb);
		pcb.setState(this);
	}

	PCB get(int index) {
		return pcbs.get(index);
	}

	int size() {
		return pcbs.size();
	}

	void reset() {
		pcbs.clear();
	}

}
