
interface Run {
	final static int MAXSPEED = 50;
	int MINSPEED = 10;
	
	public void start();      //�߻�޼ҵ�
	public void running();   
	public void stop();

}
class Park implements Run{
	public void start() {
		System.out.println("Park MAXSPEED = "+MAXSPEED);
		System.out.println("Park2�ÿ� �ι߷� �ٱ� �����Ѵ�.");
	}
	public void running() {
		System.out.println("Park 1�ð�° �ι߷� �ٰ� �ִ�.");
	}
	public void stop() {
		System.out.println("Park 3�� 10�п� �ι߷� �����.");
	}
}

class Buldog implements Run{      //�������̽� ���
	public void start() {
		System.out.println("Buldog�� �׹߷� �����Ѵ�.");
	}
	public void running() {
		System.out.println("Buldog�� �ְ�ӵ��� 4�߷� �ڴ�.");
	}
	public void stop() {
		System.out.println("Buldog�� ���̸� ���� ���߾���.");
	}
}