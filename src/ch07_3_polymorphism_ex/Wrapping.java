package ch07_3_polymorphism_ex;

class Box { 
	public void simpleWrap() {
		System.out.println("simple Wrapping");
	}
}
class PaperBox extends Box {
	public void praperWrap () {
		System.out.println("Paper Wrapping");
	}
}

class GoldPaperBox extends PaperBox {
	public void GoldWrap() {
	System.out.println("Gold Wrapping");
}
	


public class Wrapping {
	public static void main(String[] args) {
	
		Box box1 	= new Box();
		PaperBox box2 = new PaperBox();
		GoldPaperBox box3 = new GoldPaperBOx();
		
		wrapBox(box1);
		wrapBox(box2);
		wrapBox(box3);
	}
	private static void  wrapBox( Box box) {
		if (box instanceof GoldPaperBox) {
		((GOldPaperBox)box).goldWrap();
		}else if (box instanceof PaperBox) {
			((PaperBox)box ).praperWrap();
		}else  {
			box.simpleWrap();
		}
	}
}
