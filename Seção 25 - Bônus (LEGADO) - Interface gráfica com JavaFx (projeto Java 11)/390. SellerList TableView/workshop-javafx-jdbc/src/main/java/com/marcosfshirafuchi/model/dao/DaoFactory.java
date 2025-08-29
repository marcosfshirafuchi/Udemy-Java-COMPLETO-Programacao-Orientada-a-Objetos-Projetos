package com.marcosfshirafuchi.model.dao;


import com.marcosfshirafuchi.db.DB;
import com.marcosfshirafuchi.model.dao.impl.DepartmentDaoJDBC;
import com.marcosfshirafuchi.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}
}
