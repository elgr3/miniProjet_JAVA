package model;

import java.util.List;

public class Documentaire extends media {


    public Documentaire(String description, String nom, int age_min, String bande_annonce, String genre, int date_sortie) {
        super(description, nom, age_min, bande_annonce, genre);
        this.date_sortie = date_sortie;
    }

    public int getDate_sortie() {
        return date_sortie;
    }

    public void setDate_sortie(int date_sortie) {
        this.date_sortie = date_sortie;
    }

    private int date_sortie;

}
