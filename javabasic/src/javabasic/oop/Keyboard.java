package javabasic.oop;

public class Keyboard extends Device {

	private int keyCount; // 키 개수
	private String keyboardType; // 키보드 종류 (기계식, 멤브레인 ...)

	Keyboard() {
	}

	public Keyboard(int keyCount, String keyboardType) {
		super();
		this.keyCount = keyCount;
		this.keyboardType = keyboardType;
	}

	public int getKeyCount() {
		return keyCount;
	}

	public void setKeyCount(int keyCount) {
		this.keyCount = keyCount;
	}

	public String getKeyboardType() {
		return keyboardType;
	}

	public void setKeyboardType(String keyboardType) {
		this.keyboardType = keyboardType;
	}
	
	@Override
	void on() {
		System.out.println("키보드를 켜다");
	}
	
	@Override
	void off() {
		System.out.println("키보드를 끄다");
	}		

}















