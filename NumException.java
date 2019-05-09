
public class NumException {

	public static void main(String[] args) {
		String[] stringNumber = {"23","12","998","20"};
		try 
		{
			for (int i =0; i<stringNumber.length;i++) {
				int j = Integer.parseInt(stringNumber[i]);//뒤에 문자열을 인트 형태로 바꾸는것(Integer.parseInt)
				System.out.println("숫자로 변환된 값은"+j); //3.14부분이 exception 발생으로(실수형이라)출력이 안됨
			}
		}
		catch(NumberFormatException e) {
			System.out.println("정수로 변환할 수 없습니다.");
		}
		finally{
			System.out.println("종료");

	}

}
	}


