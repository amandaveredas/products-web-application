package com.github.amandaveredas.app.model.service;

import com.github.amandaveredas.app.model.domain.Product;
import com.github.amandaveredas.app.model.domain.User;
import com.github.amandaveredas.app.repository.ProductRepository;
import com.github.amandaveredas.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getList() {
        return (List<User>) userRepository.findAll();
    }

    public List<User> getList(String sort){
        return userRepository.findAll(Sort.by(Sort.Direction.ASC, "userName"));
    }

    public void include(User user) {
        userRepository.save(user);
    }

    public void delete(Integer id) {
        userRepository.deleteById(id);
    }

    public User getById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }



}

