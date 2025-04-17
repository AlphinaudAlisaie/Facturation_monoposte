package org.TopVentes.model;

public class Acheteur {
    private final static String PAYS = "Canada";
    private String nomFamile;
    private String prenom;
    private int numeroCivic;
    private String nomRue;
    private String nomProvince;
    private String adressePostale;

    public Acheteur(String nomFamile, String prenom, int numeroCivic, String nomRue, String nomProvince, String adressePostale) {
        this.nomFamile = nomFamile;
        this.prenom = prenom;
        this.numeroCivic = numeroCivic;
        this.nomRue = nomRue;
        this.nomProvince = nomProvince;
        this.adressePostale = adressePostale;
    }

    public Acheteur() {
    }

    public String getNomFamile() {
        return nomFamile;
    }

    public void setNomFamile(String nomFamile) {
        this.nomFamile = nomFamile;
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
}
