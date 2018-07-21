package flyweight;

import java.util.HashMap;

/**
 * ��Ԫģʽ
 * ʹ�ã�����Ҫ�ù�������ʱ�򣬺�Ԫ���Լ����ڴ�ʹ����
 * ��ɫ:��Ԫ����
 * @author qzhen
 *
 */
public class FlyWeightFactory {
	
	public HashMap<Object,FlyWeight> data;
	
	public FlyWeightFactory(){
		this.data=new HashMap<>();
	}
	
	public FlyWeight getInstance(Object obj){
		if(data.containsKey(obj)){
			return data.get(obj);
		}else{
			FlyWeight flyWeight=new FlyWeight(obj);
			data.put(obj, flyWeight);
			return flyWeight;
		}
	}
}
