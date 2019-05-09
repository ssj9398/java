
public class DivideZeroException {

	public static void main(String[] args) {
		// int type의 변수 선언
		int b = 20;
		int a = 0;
		int c = 0;
		 
		int total = 0;    
		int sub = 0;

		// 두수의 나눗셈을 구한다.
		try {

			c=b/a;            //int c=b/a; 부분exception 발생    try를 쓴다.
			total = a+b;      //위에서 Exception 발생으로 인해 실행 안함(캐치 만나면 끝 다시 안올라옴)
			sub = b-a;       

		} catch (Exception ae) {
			a=2;
			c=b/a;
		}

		


		System.out.println(c);
		System.out.println(total);
		System.out.println(sub);
	}

}
