package jspbasic.listener;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MyHttpSessionListener implements HttpSessionListener {
	
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		//System.out.println("세션 생성됨!");
	}
	
	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		//System.out.println("세션 소멸됨!");
	}

}
