package com.github.amandaveredas.app.model.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tabela_usuarios")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String userName;
    private String email;
    private String password;


    @Override
    public String toString() {
        return "Usuário:" +
                "id=" + id +
                ", Nome='" + userName + '\'' +
                ", email='" + email;
    }
}


