package com.armr;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RandomNumberServlet extends HttpServlet 
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
    	HttpSession session = request.getSession();
	    Integer n1 = (Integer) session.getAttribute("number1");
	    Integer n2 = (Integer) session.getAttribute("number2");
	    
	    String name=request.getParameter("Button");
	    
	    if(name.equals("Click to Generate Random Number 1"))
	    {
	    	session.setAttribute("number1", (int)(Math.random()*100)+1);
	    }
	    else if(name.equals("Click to Generate Random Number 2"))
	    {
	    	session.setAttribute("number2", (int)(Math.random()*100)+1);
	    }
	    else if(name.equals("Find Max Number"))
	    {
	    	if (n1 != null || n2 != null) {
		        int maxi = Math.max(n1 == null ? 0 : n1, n2 == null ? 0 : n2);
		        session.setAttribute("maxi", String.valueOf(maxi)+" Number is Greater");
	    	}
	    }
    	
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}