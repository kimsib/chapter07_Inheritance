package ch07_3_polymorphism_ex;

//ģ��
class Firend {
	private String name;
	private String phone;

	// ������
	public Friend(String na, String ph) {
		name = na;
		phone = ph;
	}

	public String getName() {
		return name;

	}

	public String getphone() {
		return phone;

	}

	public void showInfo() {
		System.out.println("�̸�:" + name);
		System.out.println("��ȭ:" + phone);
	}

}

//����ģ��
class UnivFriend extends Friend {

	private String major;

	// ������
	public UnivFriend(String na, String ma, String ph) {
		super(na, ph);

		major = ma;

	}

	// �޼ҵ�
	public void showInfo() {
		System.out.println("�̸�: " + name);
		System.out.println("����: " + major);
		System.out.println("��ȭ: " + phone);

	}

}

// ���嵿��
class CompFriend {
	// �ʵ�

	private String department;

//  ������ 
	public CompFriend(String na, String de, String ph) {

		super(na, ph);
		department = de;

	}

	public void showInfo() {
		super.showInfo();
		System.out.println("�μ�: " + department);
	}

}

public class MyFriend2 {
	public static void main(String[] args) {

		// ģ���� ������ ���� �迭�� ����
		Friend[] frns = new Friend[6];
		int cnt = 0;

		// ����ģ�� �߰�
		frns[cnt++] = new UnivFriend("LEE", "Computer", "010-1");
		frns[cnt++] = new UnivFriend("SEO", " Electronics", "010-2");
		frns[cnt++] = new UnivFriend("KIM", "Math", "010-3");

		// ����ģ�� �߰�

		frns[cnt++] = new CompFriend("LEE", "R&D", "010-1");
		frns[cnt++] = new CompFriend("SEO", "R&D", "010-2");
		frns[cnt++] = new CompFriend("KIM", "R&d", "010-3");

		for (int i = 0; i < frns.length; i++) {
			frns[i].showInfo();
			if (frns[i].getName().equals("LEE")) {
				System.out.println("ģ�� LEE(��) ��� %d��°���� ã�ҽ��ϴ�.\n", i + 1);
			}

		}

	}

}
