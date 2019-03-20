package template;
/**
 * ������ģ��
 * @author qzhen
 *  ����ͬ�����ҵ����������Ȼ��������ʵ�����еĲ���
 */
public  abstract class Beverage {
		
	public final void prepareTemplate(){
		boilWater();
		putIntoCup();
		addHotWater();
		if(isCustom()){
		addCondiments();
		}
	}
	
	private void boilWater(){
		System.out.println("boil Water");
	}
	
	public abstract void putIntoCup();
	
	private void addHotWater(){
		System.out.println("add hot water");
	}
	
	public abstract void addCondiments();
	
	public abstract boolean isCustom();
}
