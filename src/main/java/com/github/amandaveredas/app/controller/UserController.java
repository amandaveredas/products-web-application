package com.github.amandaveredas.app.controller;

import com.github.amandaveredas.app.model.domain.Product;
import com.github.amandaveredas.app.model.domain.User;
import com.github.amandaveredas.app.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/list")
    private String getList(Model model) {
        model.addAttribute("users",userService.getList());
        return "user/list";
    }

    @GetMapping({"/user"})
    public String registrationScreen() {
        return "user/registration";
    }

    @GetMapping({"/user/{id}/delete"})
    public String deleteUser(Model model, @PathVariable Integer id) {
        User deletedUser = userService.getById(id);
        //RESOLVER ESSA BAGAÇA COM UM THROW
        if (deletedUser != null){
            userService.delete(id);
            model.addAttribute("message", "Usuário excluído com sucesso");
        }else{
            model.addAttribute("message", "Usuário não econtrado! Não foi possível excluir");
        }
        return getList(model);
    }

    @GetMapping({"/user/{id}/consult"})
    public String consultUser(Model model, @PathVariable Integer id) {
        User consultedUser = userService.getById(id);
        model.addAttribute("user", consultedUser);
        return registrationScreen();
    }

    @PostMapping("/user/include")
    public String include(Model model, User user ){
        userService.include(user);
        model.addAttribute("message", "O usuário " + user.getUserName() + " foi criado com sucesso!");
        return getList(model);
    }

    @PostMapping("/user/orderBy")
    public String orderBy(Model model, @RequestParam String sortBy){
        model.addAttribute("users", userService.getList(sortBy));
        return "user/list";
    }

    @GetMapping("/returnUserList")
    public String goBack(){
        return "redirect:/user/list";
    }
}
