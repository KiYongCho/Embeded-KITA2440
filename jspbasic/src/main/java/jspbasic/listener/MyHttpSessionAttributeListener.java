package jspbasic.listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class MyHttpSessionAttributeListener implements HttpSessionAttributeListener {

	@Override
	public void attributeAdded(HttpSessionBindingEvent event) {
		//System.out.println("세션 속성 추가!");
	}
	
	@Override
	public void attributeRemoved(HttpSessionBindingEvent event) {
		//System.out.println("세션 속성 제거!");		
	}
	
	@Override
	public void attributeReplaced(HttpSessionBindingEvent event) {
		//System.out.println("세션 속성 대체!");		
	}
	
}
