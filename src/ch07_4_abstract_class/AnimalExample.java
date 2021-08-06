package ch07_4_abstract_class;

abstract class Animal {
	public String Kind;

	public void breathe() {
		System.out.println("숨을 쉽니다.");

	}

	// 추상 메소드
	public abstract void sound();

}

class Dog extends Animal {
	public Dog() {
		this.Kind = "포유류";
	}

	@Override
	public void sound() {
		System.out.println("멍멍");
	}

}

class Cat extends Animal {
	public Cat() {
		this.Kind = "포유류";
	}

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
		System.out.println("--------------");
		
		
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		
		
		
		animal = new Cat();
		animal.sound();
		System.out.println("--------------");
		
		
		//메소드의 다양성
		animalsound(new Dog());
		animalsound(new Cat());
		

	}

	private static void animalsound(Cat cat) {
		// TODO Auto-generated method stub
		
	}

	private static void animalsound(Dog dog) {
		// TODO Auto-generated method stub
		
	}
}
