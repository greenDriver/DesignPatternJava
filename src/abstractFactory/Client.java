package abstractFactory;
/**
 * �����ͻ���	������Ҫ�Ĳ�Ʒ�����ɲ�Ʒ
 * �ŵ�:Ҫ�����²�Ʒ�������¹����࣬�������޸�ĳ��������
 * ˵��:ʹ�òο���https://www.cnblogs.com/malihe/p/6891920.html
 * @author qzhen
 *
 */
public class Client {

	public Food get(String name){
		Food food=null;
		if(name.equals("ClassA")){
			food=new FactoryA().getFood();
		}else if(name.equals("ClassB")){
			food=new FactoryB().getFood();
		}
		return food;
	}
	
}
