public class Teacher extends PersonInfo {
	//private 접근 지정자를 통한 멤버 변수 선언
	//private String name;
	//private int age;
	private String subject;    //같은 클래스 안에서만 접근 가능
	//멤버 변수에 특정 값을 할당 할 수 있는 set Method
	public void setName(String name) {
		this.name = name;    //위에 name과 string name과 같게
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	//멤버 변수에 할당된 값을 화면에 출력시키는 메소드
	public void printInfo() {
		System.out.println("name ="+name);
		System.out.println("age="+age);
		System.out.println("subject="+subject);
	}
}

//extends PersonInfo  상속 받기