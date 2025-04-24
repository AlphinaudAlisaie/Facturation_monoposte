package org.TopVentes.model;

public class Acheteur {
    private final static String PAYS = "Canada";
    private String nomFamille;
    private String prenom;
    private int numeroCivic;
    private String nomRue;
    private String nomProvince;
    private String adressePostale;

    public Acheteur(String nomFamille, String prenom, int numeroCivic, String nomRue, String nomProvince, String adressePostale) {
        this.nomFamille = nomFamille;
        this.prenom = prenom;
        this.numeroCivic = numeroCivic;
        this.nomRue = nomRue;
        this.nomProvince = nomProvince;
        this.adressePostale = adressePostale;
    }

    public Acheteur() {
    }

    public String getNomFamille() {
        return nomFamille;
    }

    public void setNomFamille(String nomFamille) {
        this.nomFamille = nomFamille;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getNumeroCivic() {
        return numeroCivic;
    }

    public void setNumeroCivic(int numeroCivic) {
        this.numeroCivic = numeroCivic;
    }

    public String getNomProvince() {
        return nomProvince;
    }

    public void setNomProvince(String nomProvince) {
        this.nomProvince = nomProvince;
    }

    public String getNomRue() {
        return nomRue;
    }

    public void setNomRue(String nomRue) {
        this.nomRue = nomRue;
    }

    public String getAdressePostale() {
        return adressePostale;
    }

    public void setAdressePostale(String adressePostale) {
        this.adressePostale = adressePostale;
    }


    /**
     * Methode pour valider le prenom
     * @return vrai si le prénom a au moins 3 lettres
     */
    private boolean validerPrenom(){
        return prenom.trim().length() >= 3;
    }

    /**
     * Methode pour valider le nom de famille
     * @return vrai si le nomFamille est valide
     */
    private boolean validerNom(){
        return nomFamille.trim().length()>=2;
    }



}
