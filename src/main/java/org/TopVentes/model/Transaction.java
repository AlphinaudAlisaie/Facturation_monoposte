package org.TopVentes.model;

public class Transaction {
    public final static double TAUX_POURCENTAGE_TPS = 0.05;
    public final static double TAUX_POURCENTAGE_TVQ = 0.09975;

    public enum MODESPAIEMENT
    {
        VISA,
        COMPTANT,
        DEBIT
    }

    private int numeroServantIdentificationPourCarte;
    private double montantAvantTaxes;
    private int numeroTransaction;

    public Transaction() {
        this.numeroTransaction++;


    }

    /**
     * Methode pour calculer total de la facture
     * @return  total de la facture
     */
    public double calculeTotalFacture(){
        return -1;
    }



}
