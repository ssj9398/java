
public class Computer extends Calculator {

	/*@Override
	double areaCircle(double r) {
		// TODO Auto-generated method stub
		return super.areaCircle(r);
	}*/
	@Override  //부모가 갖고 있는것을 재정의
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r *r;
	}
}