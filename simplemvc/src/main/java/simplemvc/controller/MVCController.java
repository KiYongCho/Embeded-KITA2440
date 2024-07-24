package simplemvc.controller;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import simplemvc.command.AgeCommand;
import simplemvc.command.Command;
import simplemvc.command.HobbyCommand;
import simplemvc.command.NameCommand;

// 컨트롤러의 역할
// 요청을 받아서 요청을 분석하고 요청파라미터에 따라 포워딩할 뷰와 뷰에 표시할 데이터(모델)를 결정하고
// 뷰로 포워딩

@WebServlet(urlPatterns = "/controller")
public class MVCController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req, resp);
	}
	
	public void processRequest(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		// command.properties 파일을 읽어서 Properties맵에 저장
		Properties prop = new Properties();
		File file = new File("D:\\embeded\\eclipse_workspace\\simplemvc\\src\\main\\java\\simplemvc\\prop\\command.properties");
		prop.load(new FileReader(file));
				
		// 커맨드 패턴
		Command command = null;
		try {
			// 명령에 따른 명령처리클래스를 생성
			Class cl = Class.forName((String)(prop.get(req.getQueryString())));
			// 명령처리클래스의 객체를 생성 
			command = (Command)cl.newInstance();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		// request에 속성변수 설정
		req.setAttribute("resultObj", command.returnModel());
		
		// 컨트롤러의 역할 3. 생성된 결과를 뷰에 전달
		RequestDispatcher dispatcher = req.getRequestDispatcher((String)command.returnView());
		dispatcher.forward(req, resp);
		
	}
	

} // class













