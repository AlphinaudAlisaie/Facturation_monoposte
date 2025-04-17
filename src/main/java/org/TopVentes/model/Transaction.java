package org.TopVentes.model;

import java.util.Date;

public class Transaction {
    public final static double POURCENTAGE_EN_DECIMAL_TPS = 0.05;
    public final static double POURCENTAGE_EN_DECIMAL_TVQ = 0.09975;
    private MODESPAIEMENT modePaiement;
    private double montantAvantTaxes;
    private String numeroIdentificationCarte;
    private String numeroTransaction;
    private Date dateTransaction;
    private double montantEcofrais;

    public enum MODESPAIEMENT
    {
        VISA,
        ARGENT_COMPTANT,
        DEBIT
    }



    //constructeur
    public Transaction(MODESPAIEMENT pModePaiement, String numeroIdentificationCarte) {
        this.modePaiement = pModePaiement;
        this.numeroIdentificationCarte = numeroIdentificationCarte;
    }

    public Transaction() {
    }

    /**
     * Methode calcule montant TPS
     * @return montant TPS
     */
    private double calculeMontantTPS(){
        return -1;
    }


    /**
     * Methode calcule montant TVQ
     * @return
     */
    private double calculeMontantTVQ(){
        return -1;
    }


    /**
     * Methode pour calculer total de la facture
     * @return  total de la facture
     */
    public double calculeTotalFacture(){
        return -1;
    }


    /**
     * Méthode pour calculer le montant du don du vendeur
     * @return montant que le vendeur va donner en don
     */
    public double calculeMontantDonParVendeur(){
        return -1;
    }

}
