package proxy;
/**
 * ����ģʽ
 * ʹ�ó���������Ҫ����ĳ�����󣬲�ֱ�ӷ��ʶ��󣬶�ͨ����������ʵ�ַ��ʶ���ִ�ж���ҵ��
 * @author qzhen
 *
 */
public class ProxyDemo {

		public static void main(String[] args) {
			ICoder coder=new JavaCoder("zhang");
			ICoder proxyCoder=new ProxyCoder(coder);
			proxyCoder.implDemand("Add user management");
		}
		
}
