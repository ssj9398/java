class Count{
	static int number=3;
}

public class Exam_06 {

	public static void main(String[] args) {
		Count c1 = new Count();   //객체 생성
		System.out.println("c1.number ="+c1.number);
		c1.number++;    //1증가
		System.out.println("c1.number ="+c1.number);
		
		Count c2 = new Count();   //객체 생성
		System.out.println("c2.number ="+c2.number);
		c2.number++;    //1증가
		System.out.println("c2.number ="+c2.number);
		

	}

}

//static 사용