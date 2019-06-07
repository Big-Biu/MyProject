package com.gkb.UserServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gkb.UserService.Login;
import com.gkb.UserService.User;

public class allUser extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<User> list=new ArrayList<User>();
		
		String pages=null;
		if(request.getParameter("page")==null) pages="1";
		else 
			pages=request.getParameter("page");
		
		Login login =new Login();
		try {
			list=login.getAllStu( pages);
			request.setAttribute("stuList", list);
			request.getRequestDispatcher("person2.jsp").forward(request, response);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


}
