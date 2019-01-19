package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Calculatrice;

/**
 * Servlet implementation class Accueil
 */
@WebServlet({"/","/calculatrice"})
public class Accueil extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Accueil() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getRequestURI();

		if (path.contains("calculatrice") ) {
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
			
			String num1 = !(request.getParameter("num1").equals(null)||request.getParameter("num1").isEmpty()) ? request.getParameter("num1") : "0" ;
			String num2 = !(request.getParameter("num2").equals(null)||request.getParameter("num2").isEmpty()) ? request.getParameter("num2") : "0" ;
			String signe = !request.getParameter("signe").equals(null) ? request.getParameter("signe") : null ;
			
			Double result = Calculatrice.calculate(num1, num2, signe);
			request.setAttribute("result", result);
			request.setAttribute("num1", num1);
			request.setAttribute("num2", num2);
			request.setAttribute("signe", signe);
			dispatcher.forward(request, response);
		}

	}

}
