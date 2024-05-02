package javabasic.oop;

public class Printer extends Device {

	private int dpi;
	private String color;

	Printer() {
	}

	public Printer(int dpi, String color) {
		super();
		this.dpi = dpi;
		this.color = color;
	}

	public int getDpi() {
		return dpi;
	}

	public void setDpi(int dpi) {
		this.dpi = dpi;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	void on() {
		System.out.println("프린터를 켜다");
	}
	
	@Override
	void off() {
		System.out.println("프린터를 끄다");
	}		

}












