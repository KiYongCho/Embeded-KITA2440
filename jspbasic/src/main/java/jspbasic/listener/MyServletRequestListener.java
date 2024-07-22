package jspbasic.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class MyServletRequestListener implements ServletRequestListener {
	
	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		//System.out.println("request 생성됨!");
	}
	
@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		//System.out.println("request 소멸됨!");
	}	

}
