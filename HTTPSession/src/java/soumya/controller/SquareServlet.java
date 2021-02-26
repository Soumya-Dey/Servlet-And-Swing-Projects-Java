// SOUMYA DEY, 704, 5TH SEM, COMPUTER SCIENCE DEPT.

package soumya.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SquareServlet", urlPatterns = {"/square"})
public class SquareServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
	int result = (int)session.getAttribute("result");
	result = result * result;
	PrintWriter out = response.getWriter();
	out.println("Result: " + result);
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
