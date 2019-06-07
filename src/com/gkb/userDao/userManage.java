package com.gkb.userDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gkb.UserService.User;

public class userManage {
		public Connection getConn() throws ClassNotFoundException, SQLException{
			Connection conn=null;
			String Driver ="com.mysql.jdbc.Driver";
			String url="jdbc:mysql://localhost:3306/jsp?useUnicode=true&characterEncoding=utf8";
			Class.forName(Driver);
			conn=DriverManager.getConnection(url,"root","123");
			return conn;
		}
		public List<User> userSearch(String name) throws ClassNotFoundException, SQLException{
			List<User> list=new ArrayList<User>();
			String sql="SELECT * from user WHERE NAME LIKE ?";
			if(name!=null){
				sql="select * from user where name like '%"+name+"%'";
			}
			Connection conn=getConn();
			PreparedStatement pstmt=conn.prepareStatement(sql);
			if(name==null) pstmt.setString(1, name);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				User user =new User();
				user.setId(rs.getString("id"));
				user.setName(rs.getString("name"));
				user.setPsw(rs.getString("password"));
				user.setPosition(rs.getString("position"));
				user.setSex(rs.getString("sex"));
				list.add(user);
			}
			return list;
		}
		public User userCheck(User user) throws ClassNotFoundException, SQLException{
			Connection conn=getConn();
			User u=new  User();
			String sql="select * from user where name=? and password =?";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getPsw());
			ResultSet rs=pstmt.executeQuery();
			if(rs.next())
				{
					u.setId(rs.getString("id"));
					u.setName(rs.getString("name"));
					u.setPosition(rs.getString("position"));
					u.setSex(rs.getString("sex"));
					u.setPsw(rs.getString("password"));
					return u;
				}
			else {
				u.setPosition(null);
				return u;
				}
		}
		public List<User> getAllStu(String pages) throws ClassNotFoundException, SQLException{
			List<User> ulist=new ArrayList<User>();
			int result=(Integer.parseInt(pages)-1)*10;
			Connection conn=getConn();
			String sql="SELECT * FROM user WHERE position='学生' order by id limit ?,20";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, result);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
			{
				User user=new User();
				user.setId(rs.getString("id"));
				user.setName(rs.getString("name"));
				user.setPsw(rs.getString("password"));
				user.setPosition(rs.getString("position"));
				user.setSex(rs.getString("sex"));
				ulist.add(user);
			}
			return ulist;
		}
		public int addUser(User user) throws ClassNotFoundException, SQLException{
			String sql="insert into user values(?,?,?,?,?)";
			Connection conn=getConn();
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, user.getId());
			pstmt.setString(2, user.getName());
			pstmt.setString(3, user.getPsw());
			pstmt.setString(4, user.getPosition());
			pstmt.setString(5, user.getSex());
			int i=pstmt.executeUpdate();
			return i;
		}
		public void delUser(String id) throws ClassNotFoundException, SQLException{
			String sql ="delete  from user where id=?";
			Connection conn=getConn();
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
		}
		public void updateUser(User user) throws ClassNotFoundException, SQLException{
			String sql="update user set name=? , password=? , sex=? where id=?";
			Connection conn=getConn();
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getPsw());
			pstmt.setString(3, user.getSex());
			pstmt.setString(4, user.getId());
			pstmt.executeUpdate();
		}
}
