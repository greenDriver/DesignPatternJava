package bridge;
/**
 * �Ž�ģʽ
 * ʹ�ó���		˵��:����Shape����drawAPI�ӿ�
 * ��ע:ϣ���п�����һ�����ۣ��Ž�ģʽ��ʹ�á���������ǲο�����԰��һ��Demo
 * @author qzhen
 *
 */
public class Circle extends Shape {

	private int x,y,radius;
	
	public Circle(int radius ,int x, int y,DrawAPI drawAPI) {
		super(drawAPI);
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		drawAPI.drawCircle(radius, x, y);
	}
	
	public static void main(String[] args) {
		Shape redCircle=new Circle(100,10,10,new RedCircle());
		Shape greenCircle=new Circle(100,10,10,new GreenCircle());
		redCircle.draw();
		greenCircle.draw();
		
	}
}
