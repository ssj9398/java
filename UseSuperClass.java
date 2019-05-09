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

//final  사용(상속은 가능해 졋으나 안에있는 내용 바꿀수없다)  
//클래스 - 상속끝,  메소드 - 내용바꾸기 x,  변수앞- 변수값 변경 x
//상속으로 접근시 ㅁ.ㅁ.ㅁ.ㅁ.ㅁ. 이런식으로 접근 안해도 됨