package ch07_3_polymorphism_ex;

class MobilePhone_ {
// 필드 

	protected String number;

	public MobilePhone_(String num) {

		number = num;
	}

	// 메소드
	public void receive() {
		System.out.println("hi from  " + this.number);
	}

}

class MobileSmartPhone extends MobilePhone_ {
	// 필드
	private String androidVer;

	// 생성자
	public MobileSmartPhone(String num, String ver) {
		super(num);
		androidVer = ver;

	}

	public void send(String number) {
		System.out.println("hello~ to " + number);
	}
	@Override
	public void receive () {
		super.receive();
		System.out.println("i am  Smart~");
	}

	public void playApp() {
		System.out.println("App is running in" + androidVer);
	}

}

public class MobileSmartPhone { 
	public static void main(String[] args) {
		// 스마트폰 객체 생성
		
		MobileSmartPhone phone = new MobileSmartPhone("010-0000-1111", " Android 7.0");
		
		phone.send("010-8888-9999");
		
		phone.receive();
		
		phone.playApp();
		
		
	}
}





































