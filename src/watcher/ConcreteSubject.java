package watcher;
/**
 * 
 * @author qzhen
 *	��ģ�ͣ�������������״̬
 */
public class ConcreteSubject extends Subject{
	
	private String state;
	
	public void change(String state){
		System.out.println("State:"+state);
		this.notifyAll(state);
		this.state=state;
	}
}
