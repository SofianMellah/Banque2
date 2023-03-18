package com.afpa.www.bean;

public class Comptes {
    private String nom;
    private int id;
    private String typeDeCompte;

    public Comptes(String nom, int id, String typeDeCompte) {
        this.nom = nom;
        this.id = id;
        this.typeDeCompte = typeDeCompte;
    }

    public String getNom() {
        return nom;
    }

    public int getId() {
        return id;
    }
    public String getTypeDeCompte() {
        return typeDeCompte;
    }
}
