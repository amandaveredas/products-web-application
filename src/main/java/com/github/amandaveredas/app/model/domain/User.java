package com.github.amandaveredas.app.model.domain;

public class User {

    private String name;
    private String telephone;
    private Adress adress;
    private String email;

    public User() {
    }

    public User(String name, String telephone, String email) {
        this.name = name;
        this.telephone = telephone;
        this.email = email;
    }

    public User(String name, String telephone, Adress adress, String email) {
        this.name = name;
        this.telephone = telephone;
        this.adress = adress;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User: \n" +
                "Nome: " + name + "\n" +
                "Telefone: " + telephone + "\n" +
                "Endereço: " + adress.getStreetName() + ", " +
                adress.getNumber() + ", " +
                adress.getComplement() + ". " +
                adress.getDistrict() + ", " +
                adress.getCity() + "/" +
                adress.getState() + ". \n " +
                adress.getCep() + "\n" +
                "Email: " + email;
    }
}
