
public class PersonInfo {
	//Student,Teacher,BaseBallPlayer�� ����� ��� ����
	String name;
	int age;
	
	//Studen, Teacher, BaseBallPlayer�� ����� set method
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//��� ���� name,age�� �Ҵ�� ���� ���
	public void printInfo() {
		System.out.println("name"+name);
		System.out.println("age"+age);
	}

}


//������ֱ� ���� private ����
//��ӹް� ������ �����ߵ�  public(������) 
//�θ�ȣ���Ҷ� �Ű��� ���� �� ����Ѵ�.(�Ű��� �ִ°��� ����ϰ� ������ �ٷ� �ؿ� (super(x)(�Ű���))
//super �θ� Ī�Ѵ�.
//this �ڱ��ڽ��� ���� ���(�ڱ� ���� ������ �θ� �� super�� ���� ���)