import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

import jpam.*;

@WebServlet("/ATest")
public class ATest extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PaEvt newPaEvt = new PaEvt();
		newPaEvt.recObjEvt(ObjEvt.CREATE);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("ATest.jsp");
		dispatcher.forward(request, response);
	}
}
