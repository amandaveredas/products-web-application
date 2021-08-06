package com.github.amandaveredas.app.model.domain;

public class Adress {

    private String streetName;
    private int number;
    private String complement;
    private String district;
    private String city;
    private String state;
    private String cep;

    public Adress() {
    }

    public Adress(String streetName, int number, String complement, String district, String city, String state, String cep) {
        this.streetName = streetName;
        this.number = number;
        this.complement = complement;
        this.district = district;
        this.city = city;
        this.state = state;
        this.cep = cep;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Endereco: " +
                streetName + ", " +
                number + ", " +
                complement + ". " +
                district + ". \n" +
                city + '\\' +
                state + ".\n" +
                cep;
    }
}


