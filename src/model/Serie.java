package model;

import java.util.List;

public class Serie extends media {


    public Serie(String description, String nom, int age_min, String bande_annonce, String genre, int annee_sortie, List<String> acteurs, int nbre_saison, List<Integer> episodes_saison) {
        super(description, nom, age_min, bande_annonce, genre);
        this.annee_sortie = annee_sortie;
        this.acteurs = acteurs;
        this.nbre_saison = nbre_saison;
        this.episodes_saison = episodes_saison;
    }

    public int getAnnee_sortie() {
        return annee_sortie;
    }

    public void setAnnee_sortie(int annee_sortie) {
        this.annee_sortie = annee_sortie;
    }

    public List<String> getActeurs() {
        return acteurs;
    }

    public void setActeurs(List<String> acteurs) {
        this.acteurs = acteurs;
    }

    public int getNbre_saison() {
        return nbre_saison;
    }

    public void setNbre_saison(int nbre_saison) {
        this.nbre_saison = nbre_saison;
    }

    public List<Integer> getEpisodes_saison() {
        return episodes_saison;
    }

    public void setEpisodes_saison(List<Integer> episodes_saison) {
        this.episodes_saison = episodes_saison;
    }

    private int annee_sortie;
    private List<String> acteurs;
    private int nbre_saison;
    private List<Integer> episodes_saison;
}
