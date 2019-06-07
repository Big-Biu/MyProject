package com.gkb.UserService;

import java.sql.SQLException;
import java.util.List;

import com.gkb.stuGradeDao.GDao;

public class gService {
		GDao gd=new GDao();
		public Grade getGrade(String name) throws SQLException, ClassNotFoundException{
			return gd.listGrade(name);
		}
		public List<Grade> classGradeService(String id) throws ClassNotFoundException, SQLException{
			return gd.classGrade(id);
		}
		public void gradeUpdate(String id,String grade) throws SQLException, ClassNotFoundException{
			gd.gradeUpdate(id, grade);
		}
}
