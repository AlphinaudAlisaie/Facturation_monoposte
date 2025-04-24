package org.TopVentes.model;

public final class Facturation {
    public Vendeur vendeur;
    public Acheteur acheteur;
    public Transaction transaction;
    public int numeroFacture;

    public Facturation(Vendeur pVendeur, Acheteur pAcheteur, Transaction pTransaction) {
        this.vendeur = pVendeur;
        this.acheteur = pAcheteur;
        this.transaction = pTransaction;
        numeroFacture++;
    }

    public Facturation() {
    }
}
