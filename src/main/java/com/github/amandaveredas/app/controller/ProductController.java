package com.github.amandaveredas.app.controller;

import com.github.amandaveredas.app.model.domain.Product;
import com.github.amandaveredas.app.model.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


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
        //RESOLVER ESSA BAGAÇA COM UM THROW
        if (deletedProduct != null){
            productService.delete(id);
            model.addAttribute("message", "Produto excluído com sucesso");
        }else{
            model.addAttribute("message", "Produto não econtrado! Não foi possível excluir");
        }
        return getList(model);
    }

    @GetMapping({"/product/{id}/consult"})
    public String consultProduct(Model model, @PathVariable Integer id) {
        Product consultedProduct = productService.getById(id);
        model.addAttribute("product", consultedProduct);
        return registrationScreen();
    }

    @PostMapping({"/product/include"})
    public String include(Model model, Product product) {

        productService.include(product);
        model.addAttribute("message", "O produto " + product.getName() + " foi incluído com sucesso!");
        return getList(model);
    }

    @GetMapping("/return")
    public String goBack(){
        return "redirect:/product/list";
    }

    @PostMapping("/product/orderBy")
    public String orderBy(Model model, @RequestParam String sortBy){
        model.addAttribute("products", productService.getList(sortBy));
        return "product/list";
    }

}
