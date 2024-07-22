package jspbasic.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListener implements ServletContextListener {
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		//System.out.println("컨텍스트 초기화됨!");
		sce.getServletContext().setAttribute("userCount", 0);
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		//System.out.println("컨텍스트 소멸됨!");
	}

}
