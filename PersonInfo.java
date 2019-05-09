
public class PersonInfo {
	//Student,Teacher,BaseBallPlayer의 공통된 멤버 변수
	String name;
	int age;
	
	//Studen, Teacher, BaseBallPlayer의 공통된 set method
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//멤버 변수 name,age의 할당된 값을 출력
	public void printInfo() {
		System.out.println("name"+name);
		System.out.println("age"+age);
	}

}


//상속해주기 위해 private 없음
//상속받고 생성자 만들어야됨  public(생성자) 
//부모호출할때 매개값 없는 것 출력한다.(매개값 있는것을 출력하고 싶으면 바로 밑에 (super(x)(매개값))
//super 부모를 칭한다.
//this 자기자신의 값을 출력(자기 값이 없을시 부모값 즉 super의 값을 출력)