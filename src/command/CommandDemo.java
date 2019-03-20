package command;

public class CommandDemo {
	
	/**
	 * �������װ�ڶ����У�ʹ�ò�ͬ�����Ӧ���ֿͻ���
	 * ������Դ:	<a>https://www.cnblogs.com/WHL5/p/9198858.html</a>
	 * @param args
	 */
	public static void main(String[] args) {
		Stock stock=new Stock();
		BuyStock buyStock=new BuyStock(stock);
		SellStock sellStock=new SellStock(stock);
		Broker broker=new Broker();
		
		broker.takeOrder(buyStock);
		broker.takeOrder(sellStock);
		broker.dealOrder();
	}
}
