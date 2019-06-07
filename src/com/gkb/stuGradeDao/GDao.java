package com.gkb.stuGradeDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gkb.UserService.Grade;

public class GDao {
	public Connection getConn() throws ClassNotFoundException, SQLException{
		Connection conn=null;
		String Driver ="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/jsp?useUnicode=true&characterEncoding=utf8";
		Class.forName(Driver);
		conn=DriverManager.getConnection(url,"root","123");
		return conn;
	}
		public Grade listGrade(String name) throws SQLException, ClassNotFoundException{
			Connection conn=getConn();
			Grade g=new Grade();
			String sql="select * from grade where name=?";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, name);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()){
				
				g.setName(rs.getString("name"));
				g.setSubject(rs.getString("subject"));
				g.setGrade(rs.getString("grade"));
			}
			return g;
		}
		public List<Grade> classGrade(String id) throws ClassNotFoundException, SQLException{
			List<Grade> list=new ArrayList<Grade>();
			String sql="select * from math where class=? order by id";
			Connection conn=getConn();
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
				Grade g=new Grade();
				g.setId(rs.getString("id"));
				g.setName(rs.getString("name"));
				g.setSubject(rs.getString("subject"));
				g.setGrade(rs.getString("score"));
				g.setTeacher(rs.getString("teacher"));
				g.setNote(rs.getString("class"));
				list.add(g);
			}
			return list;
		}
		public void gradeUpdate(String id,String grade) throws SQLException, ClassNotFoundException{
			Connection conn=getConn() ;
			String sql="update math set score=? where id=?";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, grade);
			pstmt.setString(2, id);
			pstmt.executeUpdate();
		}
}
