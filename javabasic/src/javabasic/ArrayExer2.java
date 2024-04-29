package javabasic;

public class ArrayExer2 {

	public static void main(String[] args) {
		
		// 실습 1) 1~100까지의 정수를 배열에 담아 출력
		int[] intArray = new int[100];
		int intArrayLeng = intArray.length;
		for (int i=0; i<intArrayLeng; i++) {
			intArray[i] = i + 1;
			System.out.println(intArray[i]);
		}
		
		// 실습 2) 1~100까지의 정수 중에서 홀수만 배열에 담아 출력
		int[] intArray2 = new int[50];
		int intArrayLeng2 = intArray2.length;
		for (int i=0; i<intArrayLeng2; i++) {
			intArray2[i] = i*2 + 1;
			System.out.println(intArray2[i]);
		}
		
		System.out.printf("%10d %10.2f %10s", 99999, 3.141592, "hello");
		
		// 실습 3) 아래 데이터로 2차원 배열을 만들어서 출력
		//           이름    국어    영어    수학
		//           홍길동  100    90     80
		//           강감찬    90    80     70
		//           이순신    80    70     60
		String[] nameArr = {"홍길동", "강감찬", "이순신"};
		int[][] scoreArr = {
				{100, 90, 80},	
				{90, 80, 70},	
				{80, 70, 60}	
		};
		System.out.printf("\n%10s %10s %10s %10s", "이름", "국어", "영어", "수학");
		int nameArrLeng = nameArr.length;
		int scoreArrLeng = scoreArr.length;
		for (int i=0; i<nameArrLeng; i++) {
			System.out.printf("\n%10s", nameArr[i]);
			for (int j=0; j<scoreArrLeng; j++) {
				System.out.printf("%10d", scoreArr[i][j]);
			}
		}
		
		System.out.println();
		
		// 실습 4) 개인별 / 과목별 총점과 평균을 실습 3)에 추가해서 출력		
		String[] nameArr2 = {"홍길동", "강감찬", "이순신"};
		int[][] scoreArr2 = {
				{100, 90, 80},	
				{90, 80, 70},	
				{80, 70, 60}	
		};
		// 개인별 총점/평균
		int[][] pAgg = { {0, 0}, {0, 0}, {0, 0} };
		// 과목별 총점/평균
		int[][] sAgg = { 	{0, 0}, {0, 0}, {0, 0} };
		System.out.printf("\n%10s %10s %10s %10s %10s %10s", "이름", "국어", "영어", "수학", "총점", "평균");
		int nameArrLeng2 = nameArr2.length;
		int scoreArrLeng2 = scoreArr2.length;
		for (int i=0; i<nameArrLeng2; i++) {
			System.out.printf("\n%10s", nameArr2[i]);
			for (int j=0; j<scoreArrLeng2; j++) {
				pAgg[i][0] += scoreArr2[i][j]; // 개인별 총점
				sAgg[j][0] += scoreArr2[i][j]; // 과목별 총점				
				System.out.printf("%10d", scoreArr2[i][j]);
			}
			pAgg[i][1] = pAgg[i][0]/scoreArrLeng2; // 개인별 평균
			System.out.printf("%10d %10d", pAgg[i][0], pAgg[i][1]);
		}
		for (int i=0; i<scoreArrLeng2; i++ ) {
			sAgg[i][1] = sAgg[i][0]/nameArrLeng2; // 과목별 평균	
		}
		int sAggLeng = sAgg[0].length;
		for (int i=0; i<sAggLeng; i++) {
			System.out.printf("\n%10s", i==0 ? "총점" : "평균");
			for (int j=0; j<scoreArrLeng2; j++) {
				System.out.printf("%10d", sAgg[j][i]);	
			}
		}

	} // main

} // class









