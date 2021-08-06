package com.github.amandaveredas.app.model.tests;

import com.github.amandaveredas.app.model.domain.Adress;
import com.github.amandaveredas.app.model.domain.User;

public class UsersTest {
    public static void main(String[] args) {
        Adress adress = new Adress("Rua H", 21,"casa", "Santa Cecília", "Vila Nova","ES","9999999" );
        User user = new User("Amanda","22555888",adress, "amanda@amanda.com");
        System.out.println(user.toString());


    }
}
