package com.github.amandaveredas.app.model.service;

import com.github.amandaveredas.app.model.domain.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    private static List<Product> productsColletion = new ArrayList<Product>();

    public List<Product> getList() {
        return productsColletion;
    }

    public void include(Product product) {
        productsColletion.add(product);
    }

    public void delete(Integer id){
        productsColletion.remove(productsColletion.get(id-1));
    }

    public Product getById(Integer id){
        return  productsColletion.get(id-1);
    }
}
