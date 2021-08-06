package ch07_3_polymorphism_ex;

class MobilePhone {
// �ʵ� 

	protected String number;

	public MobilePhone(String num) {

		number = num;
	}

	// �޼ҵ�
	public void receive() {
		System.out.println("hi from  " + this.number);
	}

}

class SmartPhone extends MobilePhone {
	// �ʵ�
	private String androidVer;

	// ������
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
		// ����Ʈ�� ��ü ����

		SmartPhone phone1 = new SmartPhone("010-0000-1111", " Android 7.0");
		MobilePhone phone3 = new MobilePhone("1234");
		
		
		
		
		// �θ�Ŭ������ ��������(Phone2)�� �ڽ�Ŭ����(SmartPhone)�� �ν��Ͻ��� ������ �� �ֵ�.
		// MobilePhone �� ���������� SmartPhone ���� �ν��Ͻ��� ��������!!!
		MobilePhone phone2 = new SmartPhone("010-0000-2222", " Android 7.0");
//		SmartPhone phone4 = new MobilePhone("1234");
		
		
		
		
		
		
		// ��ȭ�ɱ�
		phone1.send("010-8888-9999");
		// phone2.send("010-8888-9999");

		// ��ȭ�ޱ�
		phone2.receive();
		phone2.receive();

		// ���� �����Ͽ� ����
		phone1.playApp();
		// phone2.playApp();

	}
}
