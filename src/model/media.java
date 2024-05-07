package model;

import javax.swing.*;

public class media {

    public media(String description, String nom, int age_min, String bande_annonce, String genre) {
        this.description = description;
        this.nom = nom;
        this.age_min = age_min;
        this.bande_annonce = bande_annonce;
        this.genre = genre;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAge_min() {
        return age_min;
    }

    public void setAge_min(int age_min) {
        this.age_min = age_min;
    }

    public String getBande_annonce() {
        return bande_annonce;
    }

    public void setBande_annonce(String bande_annonce) {
        this.bande_annonce = bande_annonce;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    private String nom;
    private  String description;
    private int age_min;
    private String bande_annonce;
    private String genre;
}
