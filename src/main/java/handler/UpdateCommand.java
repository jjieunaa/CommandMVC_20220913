package handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateCommand implements CommandHandler {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		return "/jsp/update.jsp";
	}

}
