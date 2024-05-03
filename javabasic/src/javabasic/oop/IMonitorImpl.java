package javabasic.oop;

public class IMonitorImpl extends AbstractIMonitor {

	@Override
	public void brightUp() {
		System.out.println("밝기를 올립니다!");
	}

	@Override
	public void brightDown() {
		System.out.println("밝기를 내립니다!");
	}

}
