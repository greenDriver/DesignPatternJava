package singleton;
/**
 * ����ʽ-ʹ�þ�̬�������̰߳�ȫ δʵ��������
 * @author qzhen
 *
 */
public class Singleton1 {

	private Singleton1(){};
	
	private static final Singleton1 singleton=new Singleton1();
	
	public static Singleton1 getInstance(){
		return singleton;
	}
}
