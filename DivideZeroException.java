
public class DivideZeroException {

	public static void main(String[] args) {
		// int type�� ���� ����
		int b = 20;
		int a = 0;
		int c = 0;
		 
		int total = 0;    
		int sub = 0;

		// �μ��� �������� ���Ѵ�.
		try {

			c=b/a;            //int c=b/a; �κ�exception �߻�    try�� ����.
			total = a+b;      //������ Exception �߻����� ���� ���� ����(ĳġ ������ �� �ٽ� �ȿö��)
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
