package com;

import javax.servlet.*;
import java.io.*;
import java.util.*;

public class FirstServlet implements Servlet
{
		static
	{
		System.out.println("servlet class loading...");
	}
	public FirstServlet()
	{
		System.out.println("servlet instantiation...");
	}
	public void init(ServletConfig config) throws ServletException
	{
		System.out.println("init() method execution...");
	}
	public void service(ServletRequest req,ServletResponse resp) throws ServletException,IOException
	{
		resp.setContentType("text/html");
		System.out.println("service() method execution...");
		PrintWriter out=resp.getWriter();
		out.println("<h1>Welcome Innocent Advanced Java Students</h1>");
		out.println("<h1>The Server Time is:"+new Date()+"</h1>");
	}
	public void destroy()
	 {
		System.out.println("destroy() method execution...");
	}
	public ServletConfig getServletConfig()
	{
		return null;
	}
	public String getServletInfo()
	{
	 return "Developed by Durga";
	}
	
}
