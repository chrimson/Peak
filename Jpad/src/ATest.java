import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

import jpam.*;

@WebServlet("/ATest")
public class ATest extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PaEvt newPaEvt;

		switch (request.getParameter("op")) {
			case "Create":
				newPaEvt = new PaEvt();
				newPaEvt.recObjEvt(ObjEvt.CREATE);
				break;
			case "Access":
				newPaEvt = new PaEvt();
				newPaEvt.recObjEvt(ObjEvt.ACCESS);
				break;
			case "Modify":
				newPaEvt = new PaEvt();
				newPaEvt.recObjEvt(ObjEvt.MODIFY);
				break;
			case "Delete":
				newPaEvt = new PaEvt();
				newPaEvt.recObjEvt(ObjEvt.DELETE);
				break;
			case "Login":
				newPaEvt = new PaEvt();
				newPaEvt.recAccEvt(AccEvt.LOGIN);
				break;
			case "Logoff":
				newPaEvt = new PaEvt();
				newPaEvt.recAccEvt(AccEvt.LOGOFF);
				break;
			case "Fail":
				newPaEvt = new PaEvt();
				newPaEvt.recAccEvt(AccEvt.FAIL);
				break;
			case "Reset":
				newPaEvt = new PaEvt();
				newPaEvt.recAccEvt(AccEvt.RESET);
				break;
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher("ATest.jsp");
		dispatcher.forward(request, response);
	}
}
