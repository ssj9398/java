class Count02 {
	static int number=3;
	public static void printNum() {
		System.out.println("number ="+number);
	}
}
public class Count01 {

	public static void main(String[] args) {
		Count02 c1 = new Count02();
		System.out.println("c1.number ="+c1.number);
		c1.printNum();
		// 클래스이름으로 접근가능
		System.out.println("Count.number ="+Count02.number);
		Count02.printNum();

	}

}
