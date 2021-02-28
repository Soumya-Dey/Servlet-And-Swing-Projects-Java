// SOUMYA DEY, 704, 5TH SEM, COMPUTER SCIENCE DEPT.

package soumya.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConfigServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
	
	ServletContext ctx = getServletContext();
        
	String name = ctx.getInitParameter("name");
	out.print("Hi, "); out.println(name);
        
        out.println();
        
	String lan = ctx.getInitParameter("language");
	out.println("Language: " + lan);
        String ide = ctx.getInitParameter("ide");
	out.println("IDE: " + ide);
        
        out.println();
	
	ServletConfig cg = getServletConfig();
	String str3 = cg.getInitParameter("date");
	out.println("Last Updated: " + str3);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
