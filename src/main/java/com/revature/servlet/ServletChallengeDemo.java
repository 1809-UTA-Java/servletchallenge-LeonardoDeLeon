package com.revature.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * This Servlet serves as a dummy Servlet to test learn how Servlet work
 * 
 * @author Leonardo De Leon
 */

@SuppressWarnings("serial")
public class ServletChallengeDemo extends HttpServlet {
     
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		
        String arg1 = req.getParameter("name");
        String arg2 = req.getParameter("pswd");
      
        
        pw.println("Hello "+arg1+ " you are "+arg2); //?name=bob&age=17 -> Hello bob you are 17
        pw.println("Get");
        pw.close();		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
        String arg1 = req.getParameter("name");
        String arg2 = req.getParameter("age");
        pw.println("Hello "+arg1+ " you are "+arg2); //?name=bob&age=17 -> Hello bob you are 17
        pw.println("Post");
        pw.close();		
	}

}
