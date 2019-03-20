package staticproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**����ģʽ
 * ��̬������ 
 * ʹ�ó�������Ҫ������෽���Ƚ϶࣬��̬��������뷽ʽ�����㣬������ʱ���������Դ������ͳһ����
 * ˵��:����ɲο� http://www.importnew.com/26116.html
 * @author qzhen
 *
 */
public class DynamicProxyDemo {
	
	public static void main(String[] args) {
		//������
		ICoder coder=new JavaCoder("zhang");
		ICoder coder_li=new JavaCoder("Li");
		//�н���ʵ��
		InvocationHandler handler=new CodeDynamicProxy(coder);
		//�õ��������
		ClassLoader  c1=coder.getClass().getClassLoader();
		//ͨ����̬�����ȡ����ʵ��
		ICoder  proxy=(ICoder)Proxy.newProxyInstance(c1, coder.getClass().getInterfaces(), handler);
		//ִ�д���
		proxy.implDemand("Add user management");
		proxy(coder,"zhang impl a demand");
		proxy(coder_li,"li add a new module");
	}
	
	public static void proxy(ICoder coder,String content){
		InvocationHandler handler=new CodeDynamicProxy(coder);
		ClassLoader c2=coder.getClass().getClassLoader();
		ICoder proxy=(ICoder)Proxy.newProxyInstance(c2, coder.getClass().getInterfaces(), handler);
		proxy.implDemand("content");
		
	}
	
}
