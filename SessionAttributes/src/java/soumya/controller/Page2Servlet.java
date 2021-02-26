// SOUMYA DEY, 704, 5TH SEM, COMPUTER SCIENCE DEPT.

package soumya.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import soumya.model.Student;

@WebServlet(name = "Page2Servlet", urlPatterns = {"/Page2Servlet"})
public class Page2Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String studentName = request.getParameter("studentName");
		int studentAge = Integer.parseInt(request.getParameter("studentAge"));
		double studentGPA = Double.parseDouble(request.getParameter("studentGPA"));
		
		// create student object
		Student student = new Student(studentName, studentAge, studentGPA);
		
		// add student object to Session object
		HttpSession session = request.getSession();
		session.setAttribute("student", student);
		
		// goto page2
		String url = "/page2.jsp";
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
		dispatcher.forward(request,response);
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
