
public class Exam_05 {
	int x; //자동으로 0으로 초기화
	int y; //자동으로 0으로 초기화
	int a,b,c;
	public Exam_05() {     //생성자 선언
		x=10;
		y=20;
		a=100; b=200; c=300;
	}
	
	public Exam_05(int x){
		this.x=x;
	}
	
	public Exam_05(int x,int y) {
		this();
		this.y=y;
		//a=100; b=200; c=300;
	}
	public void display() {
		System.out.println("x="+this.x);
		System.out.println("y="+this.y);
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
	}

	public static void main(String[] args) {
		Exam_05 exam1 = new Exam_05(10);
		Exam_05 exam2 = new Exam_05(10,20);
		Exam_05 exam3 = new Exam_05();
		
		exam1.display();
		exam2.display();
		exam3.display();
		
	}

}

//this를 사용하면 전역변수와 같은 xy가 됨