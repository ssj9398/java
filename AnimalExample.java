
class Animal {
	public String kind;

	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	public void sound() {
		System.out.println("어흥");    //추상 메소드
	}
}

class Dog extends Animal{
	public Dog() {
		this.kind = "포유류";
	}
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal{
	public Cat() {
		this.kind = "포유류";
	}
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("---");
		//변수의 자동 타입 변환
		Animal animal = null;  //애니멀이란 객체는 애니멀 클래스를 가르켜야한다.
		animal = new Dog();  //애니멀을 상속 받아서 도그를 만든다. (어캐스팅)  부모것만 접근가능
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("----");
		

		//메소드의 다형성
		animalSound(new Dog());
		animalSound(new Cat());
	}

	public static void animalSound(Animal animal) {
		animal.sound();
	}
}