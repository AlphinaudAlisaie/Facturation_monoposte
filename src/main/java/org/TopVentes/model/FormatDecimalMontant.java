package org.TopVentes.model;

import java.text.DecimalFormat;

public interface FormatDecimalMontant {
    DecimalFormat creerFormatMontant(double pMontant);
    boolean verifierStringIsDouble(String pEntree);
    double changerStringToDouble(String pMontant);
}