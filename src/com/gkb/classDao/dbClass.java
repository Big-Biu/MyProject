package com.gkb.classDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gkb.UserService.User;
import com.gkb.classService.Classes;

public class dbClass {
	public Connection getConn() throws ClassNotFoundException, SQLException{
		Connection conn=null;
		String Driver ="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/jsp?useUnicode=true&characterEncoding=utf8";
		Class.forName(Driver);
		conn=DriverManager.getConnection(url,"root","123");
		return conn;
	}
	public List<Classes> getAllCla() throws ClassNotFoundException, SQLException{
		List<Classes> clist=new ArrayList<Classes>();
		Connection conn=getConn();
		String sql="SELECT * FROM class ";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next())
		{
			Classes c=new Classes();
			c.setCid(rs.getString("classid"));
			c.setCname(rs.getString("classname"));
			c.setCnum(rs.getString("classnum"));
			c.setCnote(rs.getString("note"));
			clist.add(c);
		}
		return clist;
	}
	public void addClass(Classes c) throws ClassNotFoundException, SQLException{
		String sql="insert into class values(?,?,?,?)";
		Connection conn=getConn();
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, c.getCid());
		pstmt.setString(2, c.getCname());
		pstmt.setString(3, c.getCnum());
		pstmt.setString(4, c.getCnote());
		pstmt.executeUpdate();
	}
	public void updateClass(Classes c) throws ClassNotFoundException, SQLException{
		String sql="update  class set classname=?, classnum=? ,note=? where classid=?";
		Connection conn=getConn();
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, c.getCname());
		pstmt.setString(2, c.getCnum());
		pstmt.setString(3, c.getCnote());
		pstmt.setString(4, c.getCid());
		pstmt.executeUpdate();
	}
	public void delClass(String id) throws ClassNotFoundException, SQLException{
		String sql="delete from class where classid=?";
		Connection conn=getConn();
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, id);
		pstmt.executeUpdate();
	}
}
		


