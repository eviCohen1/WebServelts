package com.jhonbryce;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet{
	
	public void init() { 
        System.out.println("Initial the Servlet");
        
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String Name = req.getParameter("name");
		String Password = req.getParameter("password"); 

		PrintWriter out = res.getWriter();
		out.println("Name: " + Name + "Password: " + Password);
		out.println("get request success !!!!!");
		//test
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
