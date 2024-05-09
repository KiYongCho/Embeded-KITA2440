package javabasic;

public class OuterMain {

	public static void main(String[] args) {
		
		// Outer 객체 생성
		Outer outer = new Outer();
		
		// Outer 객체를 통해 non-static inner class 객체 생성
		Outer.NSInner nsinner = outer.new NSInner();
		System.out.println(nsinner.nsinnerSStr);
		System.out.println(nsinner.nsinnerNSStr);
		
		// static inner class 객체 생성
	    Outer.SInner sinner = new Outer.SInner();
	    System.out.println(sinner.sinnerSStr);
	    System.out.println(sinner.sinnerNSStr);
	}

}
