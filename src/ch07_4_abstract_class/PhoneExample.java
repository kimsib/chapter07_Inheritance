package ch07_4_abstract_class;

abstract class phone { 
	// �ʵ�
	public String owner;
	// ������
	public phone(String owner) {
		this.owner = owner;
	}
	// �޼ҵ�
	public void turnOn() {
		System.out.println("�� ������ �մϴ�.");
	}
	public void turnOff() {
		System.out.println("�� ������ ���ϴ�.");
	}
}

//�ڽ� Ŭ����
class SmartPhone extends Phone {
	
}

public class PhoneExample {
	public static void main(String[] args) {
		phone p1 = new Phone("");	
	
	
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
