class Person{
	String name;
	String id;
	
	public Person(String name) {
		this.name = name;
	}
}
class Student01 extends Person{
	String grade;
	String department;
	
	public Student01(String name) {
		super(name);
	}
}
public class UpcastingEx {

	public static void main(String[] args) {
		Person p;
		Student01 s = new Student01("���繮");        //s= Student01 �� ���ٰ���(��ĳ����)
		p=s;//  ��ĳ���� �߻�
		
		System.out.println(p.name); //���� ����               //���ٰ���
		
		//p.grade = "A";  // ������ ����
		//p.department = "Com"; // ������ ����
			
	}

}

//�� ĳ����    
//[Student] s = (Student)p;   <-�ٿ� ĳ����