package simplemvc.command;

public class GenderCommand implements Command {

	@Override
	public Object returnModel() {
		return "남";
	}

	@Override
	public Object returnView() {
		return "/jsp/gender.jsp";
	}

}
