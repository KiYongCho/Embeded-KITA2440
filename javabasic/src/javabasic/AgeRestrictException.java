package javabasic;

public class AgeRestrictException extends RuntimeException {
	
	@Override
	public String getMessage() {
		return "연령제한예외 발생!";
	}

}
