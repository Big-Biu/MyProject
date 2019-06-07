package com.gkb.UserService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gkb.userDao.userManage;

public class Login {
		public User userLogin(User user) throws ClassNotFoundException, SQLException{
			userManage um=new userManage();
			
			return um.userCheck(user);
		}
		public List<User> getAllStu(String pages) throws ClassNotFoundException, SQLException{
			userManage um=new userManage();
			List<User> list=new ArrayList<User>();
			list=um.getAllStu(pages);
			return list;
		}
		public int addUser(User user) throws ClassNotFoundException, SQLException{
			userManage um=new userManage();
			int result=um.addUser(user);
			return result;
		}
		public void delUser(String id) throws ClassNotFoundException, SQLException{
			userManage um=new userManage();
			um.delUser(id);
		}
		public void updateUser(User user) throws ClassNotFoundException, SQLException{
			userManage um=new userManage();
			um.updateUser(user);
		}
		public List<User> searchUser(String name) throws ClassNotFoundException, SQLException{
			userManage um=new userManage();
			List<User> list=new ArrayList<User>();
			list=um.userSearch(name);
			return list; 
			
		}
}
