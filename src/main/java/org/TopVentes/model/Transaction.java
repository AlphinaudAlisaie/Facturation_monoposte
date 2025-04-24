package org.TopVentes.model;

import java.util.Date;

public class Transaction {
    private MODESPAIEMENT modePaiement;
    private double montantAvantTaxes;
    private String numeroIdentificationCarte;
    private String numeroTransaction;
    private Date dateTransaction;
    private double montantTaxesAvecEcofrais;

    public enum MODESPAIEMENT
    {
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
        if(montantAvantTaxes >=0){
            this.montantAvantTaxes = montantAvantTaxes;
        }
    }

    public String getNumeroIdentificationCarte() {
        return numeroIdentificationCarte;
    }

    public void setNumeroIdentificationCarte(String numeroIdentificationCarte) {

        if(numeroIdentificationCarte.trim().length() == 16){
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
        this.montantTaxesAvecEcofrais = montantTaxesAvecEcofrais;
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
