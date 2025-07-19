package model.dao;

import model.entities.Department;

import java.util.List;

public interface DepartmentDao {
    void insert(Department obj);
    void update(Department obj);
    void delete(Integer id);
    Department findbyId(Integer id);
    List<Department> findAll();
}
