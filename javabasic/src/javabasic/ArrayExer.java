package javabasic;

public class ArrayExer {
	
	public static void main(String[] args) {
		
		// 기본타입 배열
		int[] scores = {100, 90, 80};
		System.out.println(scores[1]);
		
		System.out.println(scores.length);
		
		for (int i : scores) {
			System.out.println(i);
		}
		
		// 참조타입 배열
		String[] names = {"홍길동", "강감찬", "이순신"};
		for (String str : names) {
			System.out.println(str);
		}
		
		// 2차원 배열
		int[][] intArray = {
				{1, 2, 3},
				{10, 20, 30}
		};
		System.out.println(intArray.length);
		System.out.println(intArray[1].length);
		System.out.println(intArray[1][2]);
		
		// 3차원 배열
		String[][][] strArray = {
				{
					{"가","나"},
					{"다","라"}
				},
				{
					{"마","바"},
					{"사","아"}
				}
		};
		System.out.println(strArray.length);
		System.out.println(strArray[0].length);
		System.out.println(strArray[0][1].length);
		System.out.println(strArray[1][0][1]);
		
		// 배열의 크기 지정
		int[] iArray = new int[5]; // 5개의 정수를 저장하는 배열
		iArray[0] = 1;
		iArray[1] = 2;
		iArray[2] = 3;
		iArray[3] = 4;
		iArray[4] = 5;
		
	} // main

} // class




























