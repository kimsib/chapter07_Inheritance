package ch07_4_abstract_class;

abstract class phone { 
	// 필드
	public String owner;
	// 생성자
	public phone(String owner) {
		this.owner = owner;
	}
	// 메소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}

//자식 클래스
class SmartPhone extends Phone {
	
}

public class PhoneExample {
	public static void main(String[] args) {
		phone p1 = new Phone("");	
	
	
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
