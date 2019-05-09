
public class InstanceofExample {
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - Child로 변환 성공");
	}
	
	public static void main(String[] args) {
		Parent parentA = new Child();      //Child 까지 다운 캐스팅 가능
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();    //Parent 까지 다운 캐스팅 가능
		method1(parentB);
		method2(parentB);   //예외발생
	}
}
//child parent 같이 사용

//형변환 할수 없을때 나오는 오류