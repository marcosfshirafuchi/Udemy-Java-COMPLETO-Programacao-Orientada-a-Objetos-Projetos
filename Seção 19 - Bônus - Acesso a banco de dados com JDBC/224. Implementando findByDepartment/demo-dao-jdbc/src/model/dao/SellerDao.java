package model.dao;

import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public interface SellerDao {
    void insert(Seller obj);
    void update(Seller obj);
    void delete(Integer id);
    Seller findbyId(Integer id);
    List<Seller> findAll();
    List<Seller> findByDepartment(Department department);
}
