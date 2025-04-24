package org.TopVentes.model;

import java.util.Date;

public class Transaction {
    private final static double TAUX_POURCENTAGE_FRAIS_CARTE_DEBIT = 0.01;
    private final static double TAUX_POURCENTAGE_FRAIS_CARTE_CREDIT = 0.03;
    private final static double TAUX_DECIMAL_CALCUL_DONS = 0.02;
    private MODESPAIEMENT modePaiement;
    private double montantAvantTaxes;
    private String numeroIdentificationCarte;
    private String numeroTransaction;
    private Date dateTransaction;
    private double montantTaxesAvecEcofrais;

    public enum MODESPAIEMENT {
        VISA,
        ARGENT_COMPTANT,
        DEBIT
    }

    //constructeur avec parametres
    public Transaction(MODESPAIEMENT pModePaiement, String numeroIdentificationCarte) {
        this.modePaiement = pModePaiement;
        this.numeroIdentificationCarte = numeroIdentificationCarte;
    }

    //constructeur par defaut
    public Transaction() {
    }

    public double getMontantAvantTaxes() {
        return montantAvantTaxes;
    }

    public void setMontantAvantTaxes(double montantAvantTaxes) {
       if(validerMontantPositif(montantAvantTaxes)) {
           this.montantAvantTaxes = montantAvantTaxes;
       }
    }

    public String getNumeroIdentificationCarte() {
        return numeroIdentificationCarte;
    }

    public void setNumeroIdentificationCarte(String numeroIdentificationCarte) {
        if (numeroIdentificationCarte.isEmpty() && numeroIdentificationCarte.trim().length() == 16) {
            this.numeroIdentificationCarte = numeroIdentificationCarte;
        }
    }

    public Date getDateTransaction() {
        return dateTransaction;
    }

    public void setDateTransaction(Date dateTransaction) {
        this.dateTransaction = dateTransaction;
    }

    public double getMontantTaxesAvecEcofrais() {
        return montantTaxesAvecEcofrais;
    }

    public void setMontantTaxesAvecEcofrais(double montantTaxesAvecEcofrais) {
        if(validerMontantPositif(montantTaxesAvecEcofrais)){
            this.montantTaxesAvecEcofrais = montantTaxesAvecEcofrais;
        }
    }

    public MODESPAIEMENT getModePaiement() {
        return modePaiement;
    }

    public void setModePaiement(MODESPAIEMENT modePaiement) {
        this.modePaiement = modePaiement;
    }

    public String getNumeroTransaction() {
        return numeroTransaction;
    }

    public void setNumeroTransaction(String numeroTransaction) {
        this.numeroTransaction = numeroTransaction;
    }

    /**
     * Methode pour valider si montant est positif
     * @param pMontant montant à vérifier
     * @return vrai si montant est positif
     */
    private boolean validerMontantPositif(double pMontant) {
        boolean montantValide = false;
        if (pMontant >= 0) {
            montantValide = true;
        }
        return montantValide;
    }

    /**
     *
     * @param pNumeroTransaction
     * @return vrai si le format est respecté
     */
    private boolean validerNumeroTransaction(String pNumeroTransaction){
        boolean estValideNumeroTransaction=false;

        return estValideNumeroTransaction;
    }

    /**
     * Methode pour calculer total de la facture
     *
     * @return total de la facture
     */
    public double calculeTotalFacture() {
        return (montantAvantTaxes + montantTaxesAvecEcofrais);
    }

    private double calculerMontantFraisModePaiement(){
        double montantFraisPaiement = 0;



        return montantFraisPaiement;
    }


    /**
     * Méthode pour calculer le montant du don du vendeur
     *
     * @return montant que le vendeur va donner en don
     */
    public double calculeMontantDonParTransaction() {
        double montantDonAjouter = TAUX_DECIMAL_CALCUL_DONS * (calculeTotalFacture() - );



        return montantDonAjouter;
    }

}
