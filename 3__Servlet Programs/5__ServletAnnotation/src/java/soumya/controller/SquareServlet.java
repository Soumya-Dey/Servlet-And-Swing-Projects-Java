// SOUMYA DEY, 704, 5TH SEM, COMPUTER SCIENCE DEPT.

package soumya.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SquareServlet", urlPatterns = {"/square"})
public class SquareServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int result = Integer.parseInt(request.getParameter("result"));
	result = result * result;
	PrintWriter out = response.getWriter();
	out.println("Result: " + result);
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
