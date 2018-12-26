package watcher.pull;
/**
 * 
 * @author qzhen
 *	��ģ�ͣ�������������״̬
 */
public class ConcreteSubject extends Subject{
	
	private String state;
	
	public String getState(){
		return state;
	}
	
	public void change(String state){
		this.state=state;
		System.out.println("State:"+state);
		this.notifyObservers();
	}
}
