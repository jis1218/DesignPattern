package observerpattern;

import java.util.*;

public abstract class Subject {
	private List<IObserver> observers = new ArrayList<IObserver>();
	
	public void attach(IObserver observer){
		observers.add(observer);
	}
	
	public void detach(IObserver observer){
		observers.remove(observer);
	}
	
	public void notifyObservers(){
		for(IObserver o : observers){
			o.update();
		}
	}
}
