package proxy;
/**
 * �����ɫ  ˵���������ɫʵ��ҵ���߼�
 * @author qzhen
 *
 */
public class JavaCoder implements ICoder {

	private String name;
	
	public JavaCoder(String name){
		this.name=name;
	}
	@Override
	public void implDemand(String demandName) {
		// TODO Auto-generated method stub
		System.out.println(name+" implment demand:  "+demandName+" in java");
	}

}
