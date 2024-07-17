package jspbasic;

public class Car {
	
	private int sno;
	private String comp;
	private String model;
	private int cc;
	private String color;
	private int price;
	
	public Car() {
	}

	public Car(int sno, String comp, String model, int cc, String color, int price) {
		super();
		this.sno = sno;
		this.comp = comp;
		this.model = model;
		this.cc = cc;
		this.color = color;
		this.price = price;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getComp() {
		return comp;
	}

	public void setComp(String comp) {
		this.comp = comp;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [sno=" + sno + ", comp=" + comp + ", model=" + model + ", cc=" + cc + ", color=" + color
				+ ", price=" + price + "]";
	}
	
}
