/*
 * IO 실습 1)
 * 
 * assets 폴더에 이미지파일 하나, 문자파일 하나를 준비
 * 
 * 1. 사용자에게 1 또는 2를 입력받는다.
 * 2. 사용자가 1을 입력하면 이미지파일을 복사해서 assets에 저장
 * 3. 사용자가 2를 입력하면 문자파일을 복사해서 assets에 저장
 * * 파일명이 image.jpg > 복사한 파일명은 image_copy.jpg
 * * 파일명이 text.txt > 복사한 파일명은 text_copy.txt
 * 
 */

package javabasic.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCopyer {
	
	public static void main(String[] args) {
		
		FileInputStream fis_image = null;
		FileOutputStream fos_image = null;
		
		FileReader fr_text = null;
		FileWriter fw_text = null;
		
		// 사용자에게 1 또는 2를 입력 받는다.
		Scanner scanner = new Scanner(System.in);
		System.out.println("1이나 2를 입력해 주세요!");
		String inputValue = scanner.next();
		if (inputValue.equals("1")) {
			try {
				fis_image = new FileInputStream("C:\\Users\\Administrator\\git\\Embeded-KITA2440\\javabasic\\src\\assets\\car.jpg");
				fos_image =	new FileOutputStream("C:\\Users\\Administrator\\git\\Embeded-KITA2440\\javabasic\\src\\assets\\car_copy.jpg");
				
				byte[] readBytes = new byte[1024];
				int byteCount = 0;
				while ((byteCount = fis_image.read(readBytes)) > -1) {
					fos_image.write(readBytes, 0, byteCount);					
				}
				fos_image.flush();
				
			} catch (FileNotFoundException fnfe) {
				fnfe.printStackTrace();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			} finally {
				try {
					fos_image.close();
					fis_image.close();
				} catch (IOException ioe) {
					ioe.printStackTrace();
				}
			}
		} else if (inputValue.equals("2")) {
			try {
				fr_text = new FileReader("C:\\Users\\Administrator\\git\\Embeded-KITA2440\\javabasic\\src\\assets\\text.txt");
				fw_text =	new FileWriter("C:\\Users\\Administrator\\git\\Embeded-KITA2440\\javabasic\\src\\assets\\text_copy.txt");
				
				char[] readChars = new char[1024];
				int charCount = 0;
				while ((charCount = fr_text.read(readChars)) > -1) {
					fw_text.write(readChars, 0, charCount);					
				}
				fw_text.flush();				
				
			} catch (FileNotFoundException fnfe) {
				fnfe.printStackTrace();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			} finally {
				try {
					fw_text.close();
					fr_text.close();
				} catch (IOException ioe) {
					ioe.printStackTrace();
				}
			}
		}
		
		
	} // main

} // class










