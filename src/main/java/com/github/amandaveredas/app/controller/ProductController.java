package com.github.amandaveredas.app.controller;

import com.github.amandaveredas.app.model.domain.Product;
import com.github.amandaveredas.app.model.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller

public class ProductController {

    @GetMapping({"/"})
    public String initializer() {

        return "index";
    }

    @GetMapping({"/product/list"})
    public String getList(Model model) {

        ProductService productService = new ProductService();
        model.addAttribute("products", productService.getList());
        return "product/list";
    }

    @GetMapping({"/product"})
    public String registrationScreen() {
        return "product/registration";
    }

    @GetMapping({"/product/delete"})
    public String deleteProduct(Model model) {
        model.addAttribute("message", "Produto excluído com sucesso");
        return getList(model);
    }

    @GetMapping({"/product/consult"})
    public String consultProduct() {
        return "product/consult";
    }

    @PostMapping({"/product/include"})
    public String include(Model model, Product product) {
        model.addAttribute("message", "O produto " + product.getName() + " foi incluído com sucesso!");
        return getList(model);
    }


}
