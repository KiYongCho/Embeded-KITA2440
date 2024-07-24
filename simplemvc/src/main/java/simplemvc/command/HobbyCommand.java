package simplemvc.command;

public class HobbyCommand implements Command {

	@Override
	public Object returnModel() {
		return "축구";
	}

	@Override
	public Object returnView() {
		return "/jsp/hobby.jsp";
	}

}
