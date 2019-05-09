abstract class MyPoint {    //추상클래스
	int x;
	int y;
	public MyPoint(int x, int y) {          
		this.x =x; this.y = y;
	}
	protected abstract void move(int x, int y);     //추상 매소드  매개값 두개
	protected abstract void reverse();
	protected void show() {
		System.out.println(x+","+y);
	}
}

 	class MyColorPoint extends MyPoint{
	String color;
	public MyColorPoint(int x, int y, String color) {
		super(x, y);           //2,3번째줄에 부모쪽에서 선언해줬기 때문에 선언 안해줘도됨
		this.color = color;    
	}

	protected void move(int x, int y) {  //추상매소드는 무조건 오버라이딩 해줘야한다)
		this.x = y;
		this.y = x;

	}

	protected void reverse() {

	}

	protected void show() {
		System.out.println(x+","+y+","+color);// 부모것 호출하고 싶으면 아래에 super.co

	}

	public static void main(String[] args) {
		MyPoint p = new MyColorPoint(2,3,"blue"); //객체생성  p는 부모것만 호출해야한다.(오버라이딩이 되어있으면 무조건 자식것 호출)
		p.move(3,4);
		p.reverse();
		p.show();

	}
}