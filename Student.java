public class Student extends PersonInfo{
	//private ���� �����ڸ� ���� ��� ���� ����
	//private String name;
	//private int age;
	private String schoolName;
	//��� ������ Ư�� ���� �Ҵ� �� �� �ִ� set Method
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	//��� ������ �Ҵ�� ���� ȭ�鿡 ��½�Ű�� �޼ҵ�
	public void printInfo() {
		//System.out.println("name ="+name);
		//System.out.println("age="+age);
		super.printInfo();
		System.out.println("schoolName="+schoolName);
	}
}

//extends PersonInfo  ��� �ޱ�