package com.github.amandaveredas.app.repository;

import com.github.amandaveredas.app.model.domain.Product;
import com.github.amandaveredas.app.model.domain.User;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {
    public List<User> findAll(Sort sort);
}
