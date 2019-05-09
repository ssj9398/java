public class Student extends PersonInfo{
	//private 접근 지정자를 통한 멤버 변수 선언
	//private String name;
	//private int age;
	private String schoolName;
	//멤버 변수에 특정 값을 할당 할 수 있는 set Method
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	//멤버 변수에 할당된 값을 화면에 출력시키는 메소드
	public void printInfo() {
		//System.out.println("name ="+name);
		//System.out.println("age="+age);
		super.printInfo();
		System.out.println("schoolName="+schoolName);
	}
}

//extends PersonInfo  상속 받기