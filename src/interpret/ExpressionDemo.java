package interpret;
/**
 * ������ģʽ��Interpreter Pattern���ṩ���������Ե��﷨����ʽ�ķ�ʽ����������Ϊ��ģʽ��
 * ����ģʽʵ����һ�����ʽ�ӿڣ��ýӿڽ���һ���ض��������ġ�����ģʽ������ SQL ���������Ŵ�������ȡ�
 * ����������Դ��<a>https://www.cnblogs.com/WHL5/p/9198858.html </a>
 * @author qzhen
 *
 */
public class ExpressionDemo {

	public static void main(String[] args) {
			
		Expression e_male=getMaleExpression();
		Expression e_married=getMarriedWomen();
		System.out.println("Get the isMale Judge==="+e_male.interpret("Johnson"));
		System.out.println("Get the Married Judge==="+e_married.interpret("Women Marrie"));
		
	}
	
	public static Expression getMaleExpression(){
		Expression e1=new TerminalExpression("Johnson");
		Expression e2=new TerminalExpression("Robert");
		return new OrExpression(e1,e2);
	}
	
	public static Expression getMarriedWomen(){
		Expression e1=new TerminalExpression("Women");
		Expression e2=new TerminalExpression("Married");
		return new AndExpression(e1,e2);
	}
	
}
