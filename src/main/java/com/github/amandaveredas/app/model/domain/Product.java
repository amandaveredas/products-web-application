package com.github.amandaveredas.app.model.domain;

public class Product {

    private String name;
    private String company;
    private String classification;
    private String recomendedPpe;

    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }

    public Product(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public Product(String name, String company, String classification, String recomendedPpe) {
        this.name = name;
        this.company = company;
        this.classification = classification;
        this.recomendedPpe = recomendedPpe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getRecomendedPpe() {
        return recomendedPpe;
    }

    public void setRecomendedPpe(String recomendedPpe) {
        this.recomendedPpe = recomendedPpe;
    }

    @Override
    public String toString() {
        return "Produto: \n" +
                "Nome: " + name + "\n" +
                "Empresa: " + company + "\n" +
                "Classificação: " + classification + "\n" +
                "EPIs recomendados: " + recomendedPpe;
    }
}
