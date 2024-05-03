package javabasic.oop.animal;

public abstract class AbstractPlant implements ILife {
	
	String name;

	@Override
	public void breath() {
		System.out.println(name + " 숨을 쉰다!");
	}

	@Override
	public void growth() {
		System.out.println(name + " 성장 한다!");
	}

	@Override
	public void light() {
		System.out.println(name + " 광합성을 한다!");
	}

}
