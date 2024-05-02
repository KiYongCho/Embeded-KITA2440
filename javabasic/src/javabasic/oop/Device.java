package javabasic.oop;

public class Device {

	private String name;
	private int price;
	private int weight;

	Device() {
	}

	Device(String name, int price, int weight) {
		this.name = name;
		this.price = price;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	void on() {
		System.out.println("켜다");
	}
	
	void off() {
		System.out.println("끄다");
	}

}



















