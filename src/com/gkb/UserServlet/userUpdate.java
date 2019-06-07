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
import com.gkb.classService.Classes;
import com.gkb.classService.Service;

public class userUpdate extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name=request.getParameter("name");
		String psw=request.getParameter("psw");
		String id=request.getParameter("id");
		String sex=request.getParameter("sex");
		User user=new User(id,name,psw,"学生",sex);
		Login login =new Login();
		try {
			login.updateUser(user);
			request.getRequestDispatcher("allUser").forward(request, response);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

}
