
public class ComputerExample {

	public static void main(String[] args) {
		int r = 10;
		
		Calculator calculator = new Calculator();
		System.out.println(" 원면적:"+calculator.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer();
		System.out.println("원면적:"+computer.areaCircle(r));

	}

}
//calculator computer computerExample  한 파일
//한페이지에 쓰려면 부모에 public 만 빼주면됨
//computer 본인껄로 수정
