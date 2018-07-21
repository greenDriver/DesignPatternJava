package prototype;
/**
 * ԭ��ģʽ desc :extends from cloneable  create function clone to implement it
 * ���ͣ�ǳ���� 
 * @author qzhen
 *
 */
public class Prototype implements Cloneable {

	public String name="�����";
	
	public int age=25000;

	public Prototype(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public Prototype(){
		
	}
	public Object clone(){
		Prototype pro=null;
		try {
			pro=(Prototype) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			return pro;
		}
	
		
	}
		public static void main(String[] args) {
			Prototype p1=new Prototype("������",2400);
			Prototype p2=(Prototype) p1.clone();
			try {
				try {
					System.out.println("p1:"+p1.getClass().getDeclaredField("name").get(p1).toString());
					System.out.println("p2:"+p2.getClass().getDeclaredField("name").get(p2).toString());
				} catch (IllegalArgumentException | IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			} catch (NoSuchFieldException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
}
