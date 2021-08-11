package com.github.amandaveredas.app.model.service;

import com.github.amandaveredas.app.model.domain.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    public List<Product> getList(){
        List<Product> products = new ArrayList<Product>();

        products.add(new Product("Monoetilenoglicol","Atlanta"));
        products.add(new Product("Etileno","Chilesi"));
        products.add(new Product("Gás Carbônico","White Martins"));
        products.add(new Product("Gasolina Natural","Petrobras"));

        return products;
    }
}
