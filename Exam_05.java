
public class Exam_05 {
	int x; //�ڵ����� 0���� �ʱ�ȭ
	int y; //�ڵ����� 0���� �ʱ�ȭ
	int a,b,c;
	public Exam_05() {     //������ ����
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

//this�� ����ϸ� ���������� ���� xy�� ��