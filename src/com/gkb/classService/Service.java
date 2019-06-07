package com.gkb.classService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gkb.classDao.dbClass;

public class Service {
		public List<Classes> allClass() throws ClassNotFoundException, SQLException{
			List<Classes> clist=new ArrayList<Classes>();
			dbClass dc=new dbClass();
			clist=dc.getAllCla();
			return clist;
		}
		public void  addClass(Classes c) throws ClassNotFoundException, SQLException{
			dbClass dc=new dbClass();
			dc.addClass(c);
		}
		public void updateClass(Classes c) throws ClassNotFoundException, SQLException{
			dbClass dc=new dbClass();
			dc.updateClass(c);
		}
		public void delClass(String id) throws ClassNotFoundException, SQLException{
			dbClass dc=new dbClass();
			dc.delClass(id);
		}
}
