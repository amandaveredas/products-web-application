package com.github.amandaveredas.app.controller;

import com.github.amandaveredas.app.model.domain.Adress;
import com.github.amandaveredas.app.model.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller

public class UserController {

    @GetMapping({"/"})
    public String initializer(){

        return "index";
    }

    @GetMapping({"/user/list"})
    public String getList(Model model){

        /*****************ESTUDAR MODEL**************************/
        List<User> usersList = new ArrayList<User>();
        Adress adress = new Adress("Rua H", 21,"casa", "Santa Cecília", "Vila Nova","ES","9999999" );
        usersList.add(new User("Amanda","22555888",adress, "amanda@amanda.com"));

        model.addAttribute("Users",usersList);

        return "user/list";
    }


}
