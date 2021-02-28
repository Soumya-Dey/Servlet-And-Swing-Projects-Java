// SOUMYA DEY, 704, 5TH SEM, COMPUTER SCIENCE DEPT.

package soumya.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import soumya.model.GameNumber;

/**
 *
 * @author Soumya
 */
@WebServlet(name = "GameServlet", urlPatterns = {"/GameServlet", "/doGuess"})
public class GameServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // get input - target, guess, number of guesses, minimum and maximum
    GameNumber guess = new GameNumber(Integer.parseInt(request.getParameter("guess")));
    GameNumber target = new GameNumber(Integer.parseInt(request.getParameter("target")));
    GameNumber guesses = new GameNumber(Integer.parseInt(request.getParameter("guesses")));
    
    // initialize output
    String msg = "";
    String url = "/guess.jsp";
    
    // compare the guess with the target
    if (guess.getValue() == target.getValue()) {
      // winner
      msg = "Correct! You got in " + guesses.getValue() + " guesses.";
      url = "/correct.jsp";
    }
    else {
      // next guess
      guesses.increment();
      if (guess.getValue() < target.getValue()) {
        // low
        msg = "Incorrect guess! Guess higher next time.";
      } else {
        // high
        msg = "Incorrect guess! Guess lower next time.";
      }
    }
    // add values to request object to pass to the destination
    request.setAttribute("msg", msg);
    request.setAttribute("guesses", guesses);
    
    // send control to the next component
    RequestDispatcher dispatcher = request.getRequestDispatcher(url);
    dispatcher.forward(request, response);
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
