package org.TopVentes.model;

public class Vendeur {
    private final String NOM_COMPAGNIE = "TopVentes";
    private final String ADRESSE_COMPAGNIE = "456 rue Christophe (Québec, Québec, Canada) J0Z 1H0";
    private double totalDons;

    //constructeur
    public Vendeur() {
        totalDons = 0;
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

    public double getTotalDons() {
        return totalDons;
    }

    public void setTotalDons(double totalDons) {
       if(totalDons>=0){
           this.totalDons = totalDons;
       }
    }

}
