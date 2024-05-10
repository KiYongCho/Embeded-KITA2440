/*
 * IO 실습 2)
 * 1. StudentScore 데이터클래스 생성 (int sno, String name, int kor, int eng, int math, int total)
 * 2. IOExer에서 5개의 StudentScore객체 생성 후 assets/studentscore.dat에 직렬화
 * 3. 직렬화된 객체를 역직렬화하여 학생 성적데이터 출력
 * 4. 출력 시 과목별 총점도 출력
 */

package javabasic.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class IOExer {
	
	public static void main(String[] args) {
		
		List<StudentScore> ssList = new ArrayList<StudentScore>();
		ssList.add(new StudentScore(1,"홍길동",100,100,100,0));
		ssList.add(new StudentScore(2,"강길동",90,90,90,0));
		ssList.add(new StudentScore(3,"최길동",80,80,80,0));
		ssList.add(new StudentScore(4,"김길동",70,70,70,0));
		ssList.add(new StudentScore(5,"유길동",60,60,60,0));
		
		File file = null;
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			
			file = new File("C:\\Users\\Administrator\\git\\Embeded-KITA2440\\javabasic\\src\\assets\\studentscore.dat");
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(ssList);
			
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			List<StudentScore> readList = (ArrayList<StudentScore>)ois.readObject();
			int korTotal = 0;
			int engTotal = 0;
			int mathTotal = 0;
			for (StudentScore ss : readList) {
				ss.setTotal(0);
				korTotal += ss.getKor();
				engTotal += ss.getEng();
				mathTotal += ss.getMath();
				System.out.println(ss);
			}
			System.out.println("국어총점:"+korTotal
					+", 영어총점:"+engTotal+", 수학총점:"+mathTotal);
			
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				ois.close();
				oos.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
		
	} // main

} // class























