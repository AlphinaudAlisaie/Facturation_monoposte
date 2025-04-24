package org.TopVentes.model;

public class Vendeur {
    private final String NOM_COMPAGNIE = "TopVentes";
    private final String ADRESSE_COMPAGNIE = "456 rue Christophe (Québec, Québec, Canada) J0Z 1H0";
    private double soldeDons;

    //constructeur
    public Vendeur() {
        soldeDons = 0;
    }


    /**
     * Methode pour avoir nom compagnie
     * @return nom de la compagnie
     */
    public String getNOM_COMPAGNIE() {
        return NOM_COMPAGNIE;
    }

    /**
     * Methode pour avoir adresse compagnie
     * @return adresse compagnie
     */
    public String getADRESSE_COMPAGNIE() {
        return ADRESSE_COMPAGNIE;
    }

    public double getSoldeDons() {
        return soldeDons;
    }

    public void setSoldeDons(double soldeDons) {
       if(soldeDons >=0){
           this.soldeDons = soldeDons;
       }
    }

    /**
     *
     * @param pMontantDonAjoute montant de dons à ajouter au solde
     * @return nouveau solde de dons
     */
    public double augmenteSoldeDons(double pMontantDonAjoute){

        return -1;
    }

}
