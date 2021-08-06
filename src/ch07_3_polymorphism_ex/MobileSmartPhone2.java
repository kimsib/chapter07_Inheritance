package ch07_3_polymorphism_ex;

class MobilePhone {
// 필드 

	protected String number;

	public MobilePhone(String num) {

		number = num;
	}

	// 메소드
	public void receive() {
		System.out.println("hi from  " + this.number);
	}

}

class SmartPhone extends MobilePhone {
	// 필드
	private String androidVer;

	// 생성자
	public SmartPhone(String num, String ver) {
		super(num);
		androidVer = ver;

	}

	public void send(String number) {
		System.out.println("hello~ to " + number);
	}

	@Override
	public void receive() {
		super.receive();
		System.out.println("i am  Smart~");
	}

	public void playApp() {
		System.out.println("App is running in" + androidVer);
	}

}

public class MobileSmartPhone2 {
	public static void main(String[] args) {
		// 스마트폰 객체 생성

		SmartPhone phone1 = new SmartPhone("010-0000-1111", " Android 7.0");
		MobilePhone phone3 = new MobilePhone("1234");
		
		
		
		
		// 부모클래스의 참조변수(Phone2)는 자식클래스(SmartPhone)의 인스턴스를 참조할 수 있따.
		// MobilePhone 형 참조변수는 SmartPhone 형의 인스턴스를 참조가능!!!
		MobilePhone phone2 = new SmartPhone("010-0000-2222", " Android 7.0");
//		SmartPhone phone4 = new MobilePhone("1234");
		
		
		
		
		
		
		// 전화걸기
		phone1.send("010-8888-9999");
		// phone2.send("010-8888-9999");

		// 전화받기
		phone2.receive();
		phone2.receive();

		// 앱을 선택하여 실행
		phone1.playApp();
		// phone2.playApp();

	}
}
