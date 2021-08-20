package com.github.amandaveredas.app.repository;

import com.github.amandaveredas.app.model.domain.Product;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {


    public List<Product> findAll(Sort sort);
}
