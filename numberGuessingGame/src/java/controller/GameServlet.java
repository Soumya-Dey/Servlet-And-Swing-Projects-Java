// SOUMYA DEY, 704, 5TH SEM, COMPUTER SCIENCE DEPT.

package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.GameNumber;

@WebServlet(name = "GameServlet", urlPatterns = {"/GameServlet", "/doGuess"})
public class GameServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public GameServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    GameNumber guess = new GameNumber(Integer.parseInt(request.getParameter("guess")));
    
    // get session attributes
    HttpSession session = request.getSession();
    GameNumber target = (GameNumber)session.getAttribute("target");
    GameNumber guesses = (GameNumber)session.getAttribute("guesses");
    
    if(guesses.getValue() >= 15){
       String msg = "Ohh no...GAME OVER! You ran out of guesses.";
       String url = "/gameover.jsp";
       // add values to request object to pass to the destination
       request.setAttribute("msg", msg);

       // send control to the next component
       RequestDispatcher dispatcher = request.getRequestDispatcher(url);
       dispatcher.forward(request, response);
    }
    
    // initialize output
    String msg = "";
    String url = "/guess.jsp";

      // compare the guess with the target
      if (guess.getValue() == target.getValue()) {
        // winner
        msg = "Correct guess! You got in " + guesses.getValue() + " guesses.";
        url = "/correct.jsp";
      }
      else {
        // next guess
        guesses.increment();
        if (guess.getValue() < target.getValue()) {
          // low
          msg = "Incorrect guess! Guess a little HIGHER.";
        } else {
          // high
          msg = "Incorrect guess! Guess a little LOWER.";
        }
      
    }
    // add values to request object to pass to the destination
    request.setAttribute("msg", msg);
    
    // send control to the next component
    RequestDispatcher dispatcher = request.getRequestDispatcher(url);
    dispatcher.forward(request, response);
	}

}
