package com.github.amandaveredas.app.controller;

import com.github.amandaveredas.app.model.domain.Product;
import com.github.amandaveredas.app.model.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller

public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping({"/"})
    public String initializer() {

        return "index";
    }

    @GetMapping({"/product/list"})
    public String getList(Model model) {

        model.addAttribute("products", productService.getList());
        return "product/list";
    }

    @GetMapping({"/product"})
    public String registrationScreen() {
        return "product/registration";
    }

    @GetMapping({"/product/{id}/delete"})
    public String deleteProduct(Model model, @PathVariable Integer id) {
        Product deletedProduct = productService.getById(id);
        productService.delete(id);
        model.addAttribute("message", "Produto " +deletedProduct.getName() + " excluído com sucesso");
        return getList(model);
    }

    @GetMapping({"/product/consult"})
    public String consultProduct() {
        return "product/consult";
    }

    @PostMapping({"/product/include"})
    public String include(Model model, Product product) {

        productService.include(product);
        model.addAttribute("message", "O produto " + product.getName() + " foi incluído com sucesso!");
        return getList(model);
    }


}
