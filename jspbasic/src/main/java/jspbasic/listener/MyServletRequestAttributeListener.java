package jspbasic.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

public class MyServletRequestAttributeListener implements ServletRequestAttributeListener {
	
	@Override
	public void attributeAdded(ServletRequestAttributeEvent srae) {
		//System.out.println("request 속성 추가!");
	}
	
	@Override
	public void attributeRemoved(ServletRequestAttributeEvent srae) {
		//System.out.println("request 속성 제거!");
	}
	
	@Override
	public void attributeReplaced(ServletRequestAttributeEvent srae) {
		//System.out.println("request 속성 대체!");
	}
}
