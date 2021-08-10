package com.github.amandaveredas.app.model.tests;

import com.github.amandaveredas.app.model.domain.Product;

public class ProductsTest {
    public static void main(String[] args) {
        Product product = new Product("Monoetilenoglicol", "Atlanta Química Industrial Ltda","Não classificado como produto perigoso","luva de borracha");
        System.out.println(product.toString());


    }
}
