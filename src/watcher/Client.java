package watcher;
/**
 * 
 * @author qzhen
 *	client����
 */
public class Client {
		
	public static void main(String[] args) {
		ConcreteSubject subject=new ConcreteSubject();
		Observer observer=new ConcreteObserver();
		subject.attach(observer);
		subject.change("State����Ϊ��"+"state1");
	}
}
