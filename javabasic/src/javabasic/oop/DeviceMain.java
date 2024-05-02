package javabasic.oop;

import java.util.ArrayList;
import java.util.List;

public class DeviceMain {

	public static void main(String[] args) {

		// Device 객체 생성
		Device device = new Device("장비", 0 , 0);
		device.on();
		device.off();
		
		// Monitor 객체 생성
		Device monitor = new Monitor(50, 50);
		monitor.on();
		monitor.off();
		
		// Keyboard 객체 생성
		Device keyboard = new Keyboard(108, "기계식");
		keyboard.on();
		keyboard.off();
		
		// Printer 객체 생성
		Device printer = new Printer(20000, "컬러");
		printer.on();
		printer.off();
		
//		List<Device> deviceList = new ArrayList<Device>();
//		deviceList.add(monitor);
//		deviceList.add(keyboard);
//		deviceList.add(printer);
//		
//		for (Device each : deviceList) {
//			each.on();
//			each.off();
//		}
		
		List<Object> deviceList = new ArrayList<Object>();
		deviceList.add(monitor);
		deviceList.add(keyboard);
		deviceList.add(printer);
		
		for (Object each : deviceList) {
			((Device)each).on();
			((Device)each).off();
		}		
		
		Object device2 = new Device("랜카드", 20000, 500);
		((Device)device2).on();
		
		// 키보드 하나 Object타입으로 만들어서 만들어서 켜고 꺼보세요!
		Object keyboard2 = new Keyboard(128, "멤브레인");
		((Keyboard)keyboard2).on();
		((Keyboard)keyboard2).off();
		
	} // main
	
} // class






























