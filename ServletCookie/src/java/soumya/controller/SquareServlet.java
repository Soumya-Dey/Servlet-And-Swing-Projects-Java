// SOUMYA DEY, 704, 5TH SEM, COMPUTER SCIENCE DEPT.

package soumya.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SquareServlet", urlPatterns = {"/square"})
public class SquareServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int result = 0;
        double diff = 0;
        
	Cookie[] cookies = request.getCookies();
	for (Cookie c : cookies) {
		if (c.getName().contentEquals("result")) {
			result = Integer.parseInt(c.getValue());
		}
                if(c.getName().contentEquals("start")){
                    long endMilisecond = System.currentTimeMillis();
                    diff = (double)(endMilisecond - Long.parseLong(c.getValue())) * 0.001;
                }
	}
        
	result = result * result;
	PrintWriter out = response.getWriter();
	out.println("Result: " + result);
        out.println();
        out.println("Time Elapsed: " + diff + " seconds");
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
