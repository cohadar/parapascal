package cohadar.interpreter.kernel;

import java.util.Observable;

public class MyObservable extends Observable {
	public void ping() {
		this.setChanged();
		this.notifyObservers();
	}
}
