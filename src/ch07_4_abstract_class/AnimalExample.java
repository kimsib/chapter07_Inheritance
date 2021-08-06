package ch07_4_abstract_class;

abstract class Animal {
	public String Kind;

	public void breathe() {
		System.out.println("���� ���ϴ�.");

	}

	// �߻� �޼ҵ�
	public abstract void sound();

}

class Dog extends Animal {
	public Dog() {
		this.Kind = "������";
	}

	@Override
	public void sound() {
		System.out.println("�۸�");
	}

}

class Cat extends Animal {
	public Cat() {
		this.Kind = "������";
	}

	public void sound() {
		System.out.println("�߿�");
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
		
		
		//�޼ҵ��� �پ缺
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
