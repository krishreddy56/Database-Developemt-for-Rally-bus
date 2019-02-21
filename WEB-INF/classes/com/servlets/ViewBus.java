package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.BusBean;
import com.beans.TripBean;

import com.dao.Trip;

/**
 * Servlet implementation class ViewTrip
 */
@WebServlet("/ViewBus")
public class ViewBus extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewBus() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.println("<head>");
		out.println("<title>View Trips</title>");
		out.println("<link rel='stylesheet' href='styles/main.css'/>");
		out.println("</head>");
		out.println("<body >");
		
		request.getRequestDispatcher("index1.jsp").include(request, response);
		List<BusBean> list=Trip.view1();
		
		out.println("<table class='beta'>");

		out.println("<tr><th>Bus ID</th><th>Capacity</th><th>Model</th><th>Make</th></tr>");
		for(BusBean bean:list){
			out.println("<tr><td>"+bean.getBusid()+"</td><td>"+bean.getCapacity()+"</td><td>"+bean.getModel()+"</td><td>"+bean.getMake()+"</td></tr>");
		}
		out.println("</table>");
		
		out.println("</div>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
