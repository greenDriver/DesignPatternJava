package factory;
/**
 * ��̬�����������࣬�ṩ��Ʒ���췽����Ҫ������Ʒ���췽����ֻ���޸Ĺ�����
 * 						�ɸĽ�Ϊ���󹤳�ģʽ
 * @author qzhen
 *
 */
public class StaticFactory {
	
	private StaticFactory(){};
	
	public static Food getA(){
		return new ClassA();
	}
	
	public static Food getB(){
		return new ClassB();
	}
}
