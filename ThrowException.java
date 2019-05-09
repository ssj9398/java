
public class ThrowException {
	public void exceptionMethod()throws ArrayIndexOutOfBoundsException{
		int[] intA = {1,2,3,4};   //index 0~3까지 생성됨
		for(int i=0; i<10;i++) {
			if(i==4)throw new ArrayIndexOutOfBoundsException(); //exception 일부러 발생시키기
			System.out.println(intA[i]); //예외값이 발생하면 throws로 넘김
		}
	}

	public static void main(String[] args) {
		ThrowException te = new ThrowException();
		//try/catch 블럭을 이용해 예외 처리
		try {
			te.exceptionMethod();
		} catch (ArrayIndexOutOfBoundsException ab) {
			System.out.println("배열의index를 초과했습니다.");
			ab.printStackTrace(); // 한번끝나면 try로 다시 안올라감  처음에 exception 만나면 끝 finaly있을시에 무조건 실행함
		}
		

	}

}
