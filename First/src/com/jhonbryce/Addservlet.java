package com.jhonbryce;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Addservlet
 */
@WebServlet("/Addservlet")
public class Addservlet extends HttpServlet {
	@Override
//	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		int a = Integer.parseInt(req.getParameter("num1"));
//		int b = Integer.parseInt(req.getParameter("num2"));
//		int sum = a + b;
//		System.out.println("sum is " + (a + b));
//		PrintWriter out = res.getWriter();
//		out.println("sum is " + (a + b));
//	}
	
	public void init() { 
          System.out.println("Initial the Servlet");
          
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String Name = req.getParameter("name");
		String Email = req.getParameter("email"); 
		String Password = req.getParameter("password"); 
		String Phone = req.getParameter("phone"); 

		PrintWriter out = res.getWriter();
		out.println("Name: " + Name + "Email: " + Email + "Password: " + Password + "Phone " + Phone );
		out.println("get request success !!!!!");
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		int sum = a + b;
		System.out.println("sum is " + (a + b));
		PrintWriter out = res.getWriter();
		out.println("sum is " + (a + b) + " By post request");
	}
	
	public void destroy() { 
		System.out.println("Bye Bye");
	}
}
