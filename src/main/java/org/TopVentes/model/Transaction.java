package org.TopVentes.model;

public class Transaction {
    public final static double TAUX_POURCENTAGE_TPS = 0.05;
    public final static double TAUX_POURCENTAGE_TVQ = 0.09975;

    private enum modePaiement
    {
        VISA,
        Comptant,
        Debit
    }

    private int identifiantModePaiemenet;
    private double montantAvantTaxes;

}
