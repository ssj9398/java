
public class NumException {

	public static void main(String[] args) {
		String[] stringNumber = {"23","12","998","20"};
		try 
		{
			for (int i =0; i<stringNumber.length;i++) {
				int j = Integer.parseInt(stringNumber[i]);//�ڿ� ���ڿ��� ��Ʈ ���·� �ٲٴ°�(Integer.parseInt)
				System.out.println("���ڷ� ��ȯ�� ����"+j); //3.14�κ��� exception �߻�����(�Ǽ����̶�)����� �ȵ�
			}
		}
		catch(NumberFormatException e) {
			System.out.println("������ ��ȯ�� �� �����ϴ�.");
		}
		finally{
			System.out.println("����");

	}

}
	}


