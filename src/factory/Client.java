package factory;
/**
 * �����ͻ����ࣺ��ȡ��Ʒ
 * @author qzhen
 *
 */
public class Client {
	
	public Food get(String name){
		Food food=null;
		if(name.equals("ClassA")){
			food=StaticFactory.getA();
		}else if(name.equals("ClassB")){
			food=StaticFactory.getB();
		}
		return food;
	}
}
