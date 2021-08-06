package ch07_3_polymorphism_ex;

class MobilePhone_ {
// �ʵ� 

	protected String number;

	public MobilePhone_(String num) {

		number = num;
	}

	// �޼ҵ�
	public void receive() {
		System.out.println("hi from  " + this.number);
	}

}

class MobileSmartPhone extends MobilePhone_ {
	// �ʵ�
	private String androidVer;

	// ������
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
		// ����Ʈ�� ��ü ����
		
		MobileSmartPhone phone = new MobileSmartPhone("010-0000-1111", " Android 7.0");
		
		phone.send("010-8888-9999");
		
		phone.receive();
		
		phone.playApp();
		
		
	}
}





































