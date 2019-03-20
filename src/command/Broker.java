package command;

import java.util.ArrayList;
import java.util.List;
/**
 * ������ܡ�ִ����
 * @author qzhen
 *
 */
public class Broker {

	private List<Order> orders=new ArrayList<Order>();
	
	public void takeOrder(Order order){
			orders.add(order);
	}
	
	public void dealOrder(){
		for(Order o:orders){
				o.execute();
		}
		orders.clear();
	}
}
