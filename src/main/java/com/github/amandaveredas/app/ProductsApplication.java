package com.github.amandaveredas.app;

import com.github.amandaveredas.app.model.domain.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductsApplication.class, args);
	}
	Product product = new Product("Monoetilenoglicol", "Atlanta Química Industrial Ltda","Não classificado como produto perigoso","luva de borracha");


}
