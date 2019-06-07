package com.gkb.classServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gkb.classService.Classes;
import com.gkb.classService.Service;

public class addClass extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name=request.getParameter("cname");
		String num=request.getParameter("cnum");
		String id=request.getParameter("cid");
		String note=request.getParameter("note");
		Classes c=new Classes(id,name,num,note);
		Service ser=new Service();
		try {
			ser.addClass(c);
			request.getRequestDispatcher("allClass").forward(request, response);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

}
