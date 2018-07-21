package facade;
/**
 * ���ģʽ
 * ����:������ 
 * ˵��:���ж����ϵͳ�����и��Ե�ҵ�񣬿���ʹ��ͳһ�ӿڣ�������ϵͳ��ʹ�á�
 * @author qzhen
 *
 */
public class Facade {
	SubSystem system =new SubSystem();
	SubSystem1 system2=new SubSystem1();
	SubSystem2 system3=new SubSystem2();
	
	public void startSubSystem(){
		system.start();
		system2.start();
		system3.start();
	}
	
	public void stopSubSystem(){
		system.stop();
		system2.stop();
		system3.stop();
	}
}
