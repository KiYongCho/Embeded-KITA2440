<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%
	request.setCharacterEncoding("utf-8");

	int num1 = request.getParameter("num1")==null ? 0 : Integer.parseInt(request.getParameter("num1"));
	int num2 = request.getParameter("num2")==null ? 0 : Integer.parseInt(request.getParameter("num2"));
	String operator = request.getParameter("operator");
	
	if (operator!=null) {
		int result = 0;
		String opStr = "";
		if (operator.equals("+")) {
			result = num1 + num2;
			opStr = "합은";
		} else if (operator.equals("-")) {
			result = num1 - num2;
			opStr = "차는";
		} else if (operator.equals("*")) {
			result = num1 * num2;
			opStr = "곱은";
		} else if (operator.equals("/")) {
			result = num1 / num2;
			opStr = "몫은";
		}
		out.print("두 수의 " + opStr + " " + result + " 입니다!");
	} else {
		out.print("입력을 확인해 주세요!");
	}
%>




