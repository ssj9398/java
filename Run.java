
interface Run {
	final static int MAXSPEED = 50;
	int MINSPEED = 10;
	
	public void start();      //추상메소드
	public void running();   
	public void stop();

}
class Park implements Run{
	public void start() {
		System.out.println("Park MAXSPEED = "+MAXSPEED);
		System.out.println("Park2시에 두발로 뛰기 시작한다.");
	}
	public void running() {
		System.out.println("Park 1시간째 두발로 뛰고 있다.");
	}
	public void stop() {
		System.out.println("Park 3시 10분에 두발로 멈췄다.");
	}
}

class Buldog implements Run{      //인터페이스 상속
	public void start() {
		System.out.println("Buldog이 네발로 시작한다.");
	}
	public void running() {
		System.out.println("Buldog이 최고속도로 4발로 뛴다.");
	}
	public void stop() {
		System.out.println("Buldog이 먹이를 보고 멈추었다.");
	}
}