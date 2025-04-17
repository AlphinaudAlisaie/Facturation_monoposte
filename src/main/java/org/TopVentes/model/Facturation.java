package org.TopVentes.model;

public final class Facturation {
    public Vendeur vendeur;
    public Acheteur acheteur;
    public Transaction transsaction;
    public int numeroFacture;

    public Facturation(Vendeur pVendeur, Acheteur pAcheteur, Transaction pTransaction) {
        this.vendeur = pVendeur;
        this.acheteur = pAcheteur;
        this.transsaction = pTransaction;
        numeroFacture++;
    }

    public Facturation() {
    }
}
