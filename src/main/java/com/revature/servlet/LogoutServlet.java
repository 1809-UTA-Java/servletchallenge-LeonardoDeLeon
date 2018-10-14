package com.revature.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * LogoutServlet will end the session
 * 
 * @author Leonardo De Leon
 */
@WebServlet("/logout")
@SuppressWarnings("serial")
public class LogoutServlet extends HttpServlet {    

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if (session.getAttribute("name") != null) {
			session.invalidate();
		}

	}

}
