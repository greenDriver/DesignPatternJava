package staticproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * ��̬�����ɫ
 * @author qzhen
 *
 */
public class CodeDynamicProxy implements InvocationHandler {

	public ICoder coder;
	
	public CodeDynamicProxy(ICoder coder){
		this.coder=coder;
	}
	//push to developer test
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("ִ��ǰʱ��:"+System.currentTimeMillis());
		Object result=method.invoke(coder, args);
		System.out.println("ִ�к�ʱ��:"+System.currentTimeMillis());
		return result;
		
	}
	
}
