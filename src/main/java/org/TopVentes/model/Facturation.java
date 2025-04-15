package org.TopVentes.model;

public final class Facturation {

    public Vendeur vendeur;
    public Acheteur acheteur;
    public Transaction transaction;
    private int numeroFacture;

    public Facturation(Vendeur vendeur, Acheteur acheteur, Transaction transaction) {
        this.vendeur = vendeur;
        this.acheteur = acheteur;
        this.transaction = transaction;
        numeroFacture++;
    }
}
