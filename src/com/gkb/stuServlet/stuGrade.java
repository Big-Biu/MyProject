package com.gkb.stuServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gkb.UserService.Grade;
import com.gkb.UserService.gService;

public class stuGrade extends HttpServlet {

	

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String uname=request.getParameter("name");
		String name=new String(uname.getBytes("ISO-8859-1"),"utf-8");
		System.out.println(name);
		gService g=new gService();
		try {
			Grade grade=g.getGrade(name);
			request.setAttribute("stug", grade);
			request.getRequestDispatcher("results.jsp").forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	

}
