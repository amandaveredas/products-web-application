package com.github.amandaveredas.app.controller;

import com.github.amandaveredas.app.model.domain.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller

public class ProductController {

    @GetMapping({"/"})
    public String initializer(){

        return "index";
    }

    @GetMapping({"/product/list"})
    public String getList(Model model){

        /*****************ESTUDAR MODEL**************************/
        List<String> products = new ArrayList<String>();

        products.add("Monoetilenoglicol");
        products.add("Etileno");
        products.add("Gás Carbônico");
        products.add("Gasolina Natural");

        model.addAttribute("products", products);

        return "product/list";
    }


}
