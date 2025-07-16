package model.dao.impl;

import model.dao.SellerDao;
import model.entities.Seller;

import java.util.List;

public class SellerDaoJDBC implements SellerDao {
    @Override
    public void insert(Seller obj) {

    }

    @Override
    public void update(Seller obj) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public Seller findbyId(Integer id) {
        return null;
    }

    @Override
    public List<Seller> findAll() {
        return List.of();
    }
}
