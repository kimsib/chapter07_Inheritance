package ch07_3_polymorphism_ex;

//친구
class Firend {
	private String name;
	private String phone;

	// 생성자
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
		System.out.println("이름:" + name);
		System.out.println("전화:" + phone);
	}

}

//대학친구
class UnivFriend extends Friend {

	private String major;

	// 생성자
	public UnivFriend(String na, String ma, String ph) {
		super(na, ph);

		major = ma;

	}

	// 메소드
	public void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("전공: " + major);
		System.out.println("전화: " + phone);

	}

}

// 직장동료
class CompFriend {
	// 필드

	private String department;

//  생성자 
	public CompFriend(String na, String de, String ph) {

		super(na, ph);
		department = de;

	}

	public void showInfo() {
		super.showInfo();
		System.out.println("부서: " + department);
	}

}

public class MyFriend2 {
	public static void main(String[] args) {

		// 친구의 관리를 위한 배열과 변수
		Friend[] frns = new Friend[6];
		int cnt = 0;

		// 대학친구 추가
		frns[cnt++] = new UnivFriend("LEE", "Computer", "010-1");
		frns[cnt++] = new UnivFriend("SEO", " Electronics", "010-2");
		frns[cnt++] = new UnivFriend("KIM", "Math", "010-3");

		// 직장친구 추가

		frns[cnt++] = new CompFriend("LEE", "R&D", "010-1");
		frns[cnt++] = new CompFriend("SEO", "R&D", "010-2");
		frns[cnt++] = new CompFriend("KIM", "R&d", "010-3");

		for (int i = 0; i < frns.length; i++) {
			frns[i].showInfo();
			if (frns[i].getName().equals("LEE")) {
				System.out.println("친구 LEE(을) 목록 %d번째에서 찾았습니다.\n", i + 1);
			}

		}

	}

}
