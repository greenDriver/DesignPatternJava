package builder;
/**	������ģʽ
 * 		˵��:�����ͣ��ڶ������Խ϶࣬�ҹ��췽�����͸��ӣ��Թ�����ʵ�ִ�������
 * @author qzhen
 *
 */
public class Student {
	public String name=null;
	public String num=null;
	public int age=0;
	public String sex=null;
		
		 static class StudentBuilder{
			public String name=null;
			public String num=null;
			public int age=0;
			public String sex=null;
			
			public StudentBuilder setName(String name){
				this.name=name;
				return this;
			}
			
			public StudentBuilder setNum(String num){
				this.num=num;
				return this;
			}
			
			public StudentBuilder setAge(int age){
				this.age=age;
				return this;
			}
			
			public Student build(){
				return new Student(this);
			}
			
		}
		 
		 public Student(StudentBuilder builder){
			 this.name=builder.name;
			 this.sex=builder.sex;
			 this.age=builder.age;
			 this.num=builder.num;
		 }
		 
		 public String toString(){
			 return "[name: "+this.name+",age: "+this.age+",sex: "+this.sex+"]";
		 }
		 
		 public static void main(String[] args) {
			Student A=new Student.StudentBuilder().setName("����").setAge(25).build();
			Student B=new Student.StudentBuilder().setName("ҩ��").setAge(25000).build();
			System.out.println("A:"+A.toString()+"|| B:"+B.toString());
			
		}
}
