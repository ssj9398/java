public class Teacher extends PersonInfo {
	//private ���� �����ڸ� ���� ��� ���� ����
	//private String name;
	//private int age;
	private String subject;    //���� Ŭ���� �ȿ����� ���� ����
	//��� ������ Ư�� ���� �Ҵ� �� �� �ִ� set Method
	public void setName(String name) {
		this.name = name;    //���� name�� string name�� ����
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	//��� ������ �Ҵ�� ���� ȭ�鿡 ��½�Ű�� �޼ҵ�
	public void printInfo() {
		System.out.println("name ="+name);
		System.out.println("age="+age);
		System.out.println("subject="+subject);
	}
}

//extends PersonInfo  ��� �ޱ�