// SOUMYA DEY, 704, 5TH SEM, COMPUTER SCIENCE DEPT.

package soumya.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "AddServlet", urlPatterns = {"/add"})
public class AddServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int i = Integer.parseInt(request.getParameter("num1"));
	int j = Integer.parseInt(request.getParameter("num2"));
	int result = i + j;
		
	HttpSession session = request.getSession();
	session.setAttribute("result",result);
	response.sendRedirect("square");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
