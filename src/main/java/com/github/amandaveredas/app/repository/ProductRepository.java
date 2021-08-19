package com.github.amandaveredas.app.repository;

import com.github.amandaveredas.app.model.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
}
