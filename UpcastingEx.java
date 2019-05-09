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
		Student01 s = new Student01("이재문");        //s= Student01 만 접근가능(업캐스팅)
		p=s;//  업캐스팅 발생
		
		System.out.println(p.name); //오류 없음               //접근가능
		
		//p.grade = "A";  // 컴파일 오류
		//p.department = "Com"; // 컴파일 오류
			
	}

}

//업 캐스팅    
//[Student] s = (Student)p;   <-다운 캐스팅