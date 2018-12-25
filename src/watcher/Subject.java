package watcher;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author qzhen
 *	class:��������
 */
public abstract class Subject {

	private List<Observer> list=new ArrayList<Observer>();
	
	public void attach(Observer observer){
		list.add(observer);
	}
	
	public void detach(Observer observer){
		list.remove(observer);
	}
	
	public void notifyAll(String state){
		for(Observer obs:list){
				obs.update(state);
		}
	}
	
}
