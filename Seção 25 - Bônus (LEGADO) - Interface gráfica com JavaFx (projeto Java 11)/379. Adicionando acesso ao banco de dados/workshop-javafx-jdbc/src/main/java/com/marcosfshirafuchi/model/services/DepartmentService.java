package com.marcosfshirafuchi.model.services;

import com.marcosfshirafuchi.model.dao.DaoFactory;
import com.marcosfshirafuchi.model.dao.DepartmentDao;
import com.marcosfshirafuchi.model.entities.Department;

import java.util.List;

public class DepartmentService {

    private DepartmentDao dao = DaoFactory.createDepartmentDao();

    public List<Department> findAll(){
        return dao.findAll();
    }
}
