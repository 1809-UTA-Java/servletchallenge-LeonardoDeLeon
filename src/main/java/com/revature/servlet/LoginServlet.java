package com.revature.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * LoginServlet redirect to Welcome page and create a session
 * 
 * @author Leonardo De Leon
 */

@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet {
    
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		pw.println("parsing through login servlet...");
		String username = req.getParameter("name");
		String password = req.getParameter("pswd");
		
		HttpSession session = req.getSession();
		session.setAttribute(username, password);
		
		RequestDispatcher rd = req.getRequestDispatcher("welcome");
		rd.forward(req, resp);
		
	}
	

}
