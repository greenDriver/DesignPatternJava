package proxy;
/**
 * �����ɫ ˵��:���ͻ���������Ҫ�ҵ��������Բ�ֱ���ҳ���Ա�������Ҳ�Ʒ����������Ա����ͻ���ͨ��
 * @author qzhen
 *
 */
public class ProxyCoder  implements ICoder{
	
	private ICoder coder;
	
	public ProxyCoder(ICoder coder){
		this.coder=coder;
	}

	@Override
	public void implDemand(String name) {
		// TODO Auto-generated method stub
		coder.implDemand(name);
	} 
	
}
