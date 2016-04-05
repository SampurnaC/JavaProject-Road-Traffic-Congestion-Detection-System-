package projectClasses;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String space;
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		space = request.getParameter("space");
		
		ConditionChecker conc = new ConditionChecker();
		boolean result;
		
		SpaceBean bean=new SpaceBean();  
        bean.setSpace(space);  
        request.setAttribute("bean",bean); 
		result = conc.countChecker(space);
		if(result){
			response.sendRedirect("success.jsp");
			}else{
			
			response.sendRedirect("fail.jsp"); 
			}
		
		
	}

}
