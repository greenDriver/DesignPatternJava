package singleton;
/**
 * ����ʽ-���̰߳�ȫ,�����ö��̻߳���
 * @author qzhen
 *
 */
public class SingletonNotSafe {
	
	public static  SingletonNotSafe singleton;
	
	private SingletonNotSafe(){};
	
	public SingletonNotSafe getInstance(){
		if(singleton==null){
			singleton=new SingletonNotSafe();
		}
		return singleton;
	}
	
}
