package com.gkb.UserServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gkb.UserService.Login;
import com.gkb.UserService.User;

public class userLogin extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			request.setCharacterEncoding("utf-8");
			String name=request.getParameter("uname");
			String psw=request.getParameter("upsw");
			HttpSession session=request.getSession();
			User user =new User();
			user.setName(name);
			user.setPsw(psw);
			Login login=new Login();
			try {
				User u=login.userLogin(user);
				String position=u.getPosition();
				if("老师".equals(position)){
					response.sendRedirect("main2.jsp");
				}
				else if("学生".equals(position)) {
					session.setAttribute("stuInfo", u);
					response.sendRedirect("main.jsp");
					}
				else response.sendRedirect("login.jsp");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	}


