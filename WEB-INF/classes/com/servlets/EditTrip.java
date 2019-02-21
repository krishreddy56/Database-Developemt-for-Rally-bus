package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.beans.*;
import com.dao.*;


//URL annotation
@WebServlet("/EditTrip")
public class EditTrip extends HttpServlet {
	//Servlet that takes edited librarian details and call Dao function to update librarian details in database and redirects to required page. 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String departdate=request.getParameter("ddate");  
		String returndate=request.getParameter("rdate");
		int eventid=Integer.parseInt(request.getParameter("eventid"));
		String eventCategory=request.getParameter("category");
		
		
		int charge=Integer.parseInt(request.getParameter("charge"));
		
		TripBean bean=new TripBean(eventid, charge, eventCategory, departdate, returndate);
		
		
		Trip.update(bean);
		
		
	   
		response.sendRedirect("ViewTrip");
	}

}