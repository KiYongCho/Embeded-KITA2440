package javabasic;

public class Operator {

	public static void main(String[] args) {
		
		int i = 100;
		int j = -i;
		
		int i2 = i + j;
		
		int i3 = i2==100 ? 100 : 0;
		
		int i4 = 10;
		int i5 = 20;		
		System.out.println(i4+i5);
		System.out.println(i4%i5);
		
		int i6 = 15;
		if (i6==15) {
			System.out.println("i6은 15입니다");
		} else {
			System.out.println("i6은 15가 아닙니다.");
		}
		
		boolean b = false;
		System.out.println(b&true);
		System.out.println(b&false);
		System.out.println(b|true);
		System.out.println(b|false);
		
		// &&는 좌항이 false이면 우항 평가하지 않음. 전체가 false가 되므로
		// ||는 좌항이 true면 우항을 평가하지 않음. 전체가 true가 되므로
		System.out.println(b&&true);
		System.out.println(b&&false);
		System.out.println(b||true);
		System.out.println(b||false);

	}

}













