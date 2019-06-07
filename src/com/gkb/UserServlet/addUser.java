package com.gkb.UserServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gkb.UserService.Login;
import com.gkb.UserService.User;

public class addUser extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String uname=request.getParameter("addUname");
		String upsw=request.getParameter("addUpsw");
		String uid=request.getParameter("addUid");
		String usex=request.getParameter("addUsex");
		User user =new User(uid,uname,upsw,"学生",usex);
		Login login=new Login();
		try {
			int result=login.addUser(user);
			request.getRequestDispatcher("useradd.jsp").forward(request, response);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
