package com.github.amandaveredas.app.model.service;

import com.github.amandaveredas.app.model.domain.Product;
import com.github.amandaveredas.app.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

    public void include(Product product) {
        productRepository.save(product);
    }

    public void delete(Integer id){
        productRepository.deleteById(id);
    }

    public boolean verifyIfExists(Integer id){
        return productRepository.existsById(id);
    }

    public Product getById(Integer id){
        //EITA LASQUEIRA TENHO QUE ARRUMAR ISSO DAQUI COM UM THROW DA VIDA
        Product gettedByIdProduct = null;

        if (verifyIfExists(id)){
            Optional<Product> foundProduct= productRepository.findById(id);
             gettedByIdProduct = foundProduct.get();
        }
        return gettedByIdProduct;
    }
}
