package ch07_3_polymorphism_ex;

class Cake {
	public void sweet() {
		System.out.println("Cake.sweet()");
	}
	public void send() {System.out.println();
}

class CheeseCake extends Cake {
	public void mily() {
		System.out.println("CheeseCake.mily()");
	}

}

class StrawberryCheeseCake extends CheeseCake {
	public void sour() {
		System.out.println("StrawberryCheeseCake.sour()");
	}

}

public class CakeControlCode {
	public static void main(String[] args) {

		
		
		Cake cake1 = new StrawberryCheeseCake();
		CheeseCake cake2 = new StrawberryCheeseCake();
		
		cake1.sweet();
		cake2.mily();
		
		
		
		CheeseCake ca1 = new CheeseCake(); 
		Cake ca2 = ca1;
		
		Cake ca3 = new CheeseCake();
//		CheeseCake ca4 = ca3;
		
		CheeseCake ca4 = (CheeseCake)ca3; // 강제 형변환
		
		
		CheeseCake[] cakes = new CheeseCake[3];
 		
		for(int i = 0; i< cakes.length; i++) {
			cakes[0] = new CheeseCake();
			cakes[1].send();
			
			
			
			
			
			
			
			
			
			
			
		}
	}

}
