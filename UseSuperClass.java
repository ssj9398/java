class SuperClass{
	String name ="sujung";
	int age = 10;
	
	final public void printInfo() {
		System.out.println(name+":"+age);
	}
}
class SubClass extends SuperClass{
	public void printInfo() {
		System.out.println(age+":"+name);
	}
}
public class UseSuperClass {

	public static void main(String[] args) {
		SuperClass sc = new SuperClass();
		sc.printInfo();
		//SubClass sc1=new SubClass();
		//sc1.print();

	}
}

//final  ���(����� ������ ������ �ȿ��ִ� ���� �ٲܼ�����)  
//Ŭ���� - ��ӳ�,  �޼ҵ� - ����ٲٱ� x,  ������- ������ ���� x
//������� ���ٽ� ��.��.��.��.��. �̷������� ���� ���ص� ��