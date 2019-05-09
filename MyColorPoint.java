abstract class MyPoint {    //�߻�Ŭ����
	int x;
	int y;
	public MyPoint(int x, int y) {          
		this.x =x; this.y = y;
	}
	protected abstract void move(int x, int y);     //�߻� �żҵ�  �Ű��� �ΰ�
	protected abstract void reverse();
	protected void show() {
		System.out.println(x+","+y);
	}
}

 	class MyColorPoint extends MyPoint{
	String color;
	public MyColorPoint(int x, int y, String color) {
		super(x, y);           //2,3��°�ٿ� �θ��ʿ��� ��������� ������ ���� �����൵��
		this.color = color;    
	}

	protected void move(int x, int y) {  //�߻�żҵ�� ������ �������̵� ������Ѵ�)
		this.x = y;
		this.y = x;

	}

	protected void reverse() {

	}

	protected void show() {
		System.out.println(x+","+y+","+color);// �θ�� ȣ���ϰ� ������ �Ʒ��� super.co

	}

	public static void main(String[] args) {
		MyPoint p = new MyColorPoint(2,3,"blue"); //��ü����  p�� �θ�͸� ȣ���ؾ��Ѵ�.(�������̵��� �Ǿ������� ������ �ڽİ� ȣ��)
		p.move(3,4);
		p.reverse();
		p.show();

	}
}