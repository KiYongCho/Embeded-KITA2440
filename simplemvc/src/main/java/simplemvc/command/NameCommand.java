package simplemvc.command;

public class NameCommand implements Command {

	@Override
	public Object returnModel() {
		return "홍길동";
	}

	@Override
	public Object returnView() {
		return "/jsp/name.jsp";
	}

}
