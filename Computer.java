
public class Computer extends Calculator {

	/*@Override
	double areaCircle(double r) {
		// TODO Auto-generated method stub
		return super.areaCircle(r);
	}*/
	@Override  //�θ� ���� �ִ°��� ������
	double areaCircle(double r) {
		System.out.println("Computer ��ü�� areaCircle() ����");
		return Math.PI * r *r;
	}
}