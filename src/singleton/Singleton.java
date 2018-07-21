package singleton;
/**
 * ����ģʽ --DoubleChecked
 * @author qzhen
 * �ŵ㣺�̰߳�ȫ �����ٶȿ� �ӳټ���
 */
public class Singleton {
	
	private Singleton(){	};
	
	public  static volatile Singleton singleton;
	
	public static Singleton getInstance(){
		if(singleton==null){
			synchronized(Singleton.class){
				if(singleton==null){
				singleton=new Singleton();
			}
			}
		}
		
		return singleton;
	}
	
}
