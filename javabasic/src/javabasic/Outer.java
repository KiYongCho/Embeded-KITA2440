package javabasic;

public class Outer {
	
	static String outerSStr = "outer static String";
	String outerNSStr = "outer non-static String";
	
	// non-static inner class
	class NSInner {
		static String nsinnerSStr = "nsinner static String";		
		String nsinnerNSStr = "nsinner non-static String";
		String getOuterS() {
			return outerSStr;
		}
		String getOuterNS() {
			return outerNSStr;
		}
	}
	
	// static inner class
	static class SInner {
		static String sinnerSStr = "sinner static String";		
		String sinnerNSStr = "sinner non-static String";
		String getOuterS() {
			return outerSStr;
		}
		// non-static 메소드는 static 클래스 안에 선언할 수 없음 : 시점의 차이
//		String getOuterNS() {
//			return outerNSStr;
//		}		
	}
	
	public int add(int a, int b) {
		// local inner class
		// add메소드의 지역변수 위상
		class LInner {
			static String linnerSStr = "linner static String";		
			String linnerNSStr = "linner non-static String";				
		}
		return a + b;
	}

} // class







