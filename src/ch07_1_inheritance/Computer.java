package ch07_1_inheritance;

public class Computer extends Calculator {

	@Override
	double areaCircle(double r) {
		System.out.println("Computer ��ü�� areaCircle() ���� ");
		A a1 = new A();
		a1.toString();
		return super.areaCircle(r) * 1_000;
	}

	}
	class A {
		public String toString() {
			return "my message";
		}
	}
	
	
	
