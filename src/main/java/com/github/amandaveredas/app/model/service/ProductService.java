package com.github.amandaveredas.app.model.service;

import com.github.amandaveredas.app.model.domain.Product;
import com.github.amandaveredas.app.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getList() {
        return (List<Product>) productRepository.findAll();
    }

    public List<Product> getList(String sort){
        return productRepository.findAll(Sort.by(Sort.Direction.ASC, "name"));
    }

    public void include(Product product) {
        productRepository.save(product);
    }

    public void delete(Integer id){
        productRepository.deleteById(id);
    }

    public Product getById(Integer id){

        return productRepository.findById(id).orElse(null);
        
    }

}
