
public class ThrowException {
	public void exceptionMethod()throws ArrayIndexOutOfBoundsException{
		int[] intA = {1,2,3,4};   //index 0~3���� ������
		for(int i=0; i<10;i++) {
			if(i==4)throw new ArrayIndexOutOfBoundsException(); //exception �Ϻη� �߻���Ű��
			System.out.println(intA[i]); //���ܰ��� �߻��ϸ� throws�� �ѱ�
		}
	}

	public static void main(String[] args) {
		ThrowException te = new ThrowException();
		//try/catch ���� �̿��� ���� ó��
		try {
			te.exceptionMethod();
		} catch (ArrayIndexOutOfBoundsException ab) {
			System.out.println("�迭��index�� �ʰ��߽��ϴ�.");
			ab.printStackTrace(); // �ѹ������� try�� �ٽ� �ȿö�  ó���� exception ������ �� finaly�����ÿ� ������ ������
		}
		

	}

}
