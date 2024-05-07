package model;

/*public class Film extends media {

    //On definit les variables d'instances de notre classe

    public Film(String description, String nom, int age_min, String bande_annonce, String genre, int duree_film, int annee_sortie, List<String> acteurs) {
        super(description, nom, age_min, bande_annonce, genre);
        this.duree_film = duree_film;
        this.annee_sortie = annee_sortie;
        this.acteurs = acteurs;
    }

    public int getDuree_film() {
        return duree_film;
    }

    public void setDuree_film(int duree_film) {
        this.duree_film = duree_film;
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

    private int duree_film;
    private int annee_sortie;
    private List<String> acteurs;

}*/

public class CatalogueModel {
    // Exemple de données
    private String[] filmCatalogue = {"Film 1", "Film 2", "Film 3"};
    private String[] serieCatalogue = {"Serie 1", "Serie 2", "Serie 3"};
    private String[] docCatalogue = {"Doc 1", "Doc 2", "Doc 3"};

    public String[] getFilmCatalogue() {
        return filmCatalogue;
    }

    public String[] getSerieCatalogue() {
        return serieCatalogue;
    }

    public String[] getDocCatalogue() {
        return docCatalogue;
    }
}

