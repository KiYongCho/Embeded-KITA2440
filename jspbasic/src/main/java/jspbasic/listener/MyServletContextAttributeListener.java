package jspbasic.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class MyServletContextAttributeListener 
	implements ServletContextAttributeListener {

	@Override
	public void attributeAdded(ServletContextAttributeEvent event) {
		//System.out.println("ServletContext 속성 추가!");
	}
	
	@Override
	public void attributeRemoved(ServletContextAttributeEvent event) {
		//System.out.println("ServletContext 속성 제거!");
	}
	
	@Override
	public void attributeReplaced(ServletContextAttributeEvent event) {
		//System.out.println("ServletContext 속성 대체!");
	}
	
}







