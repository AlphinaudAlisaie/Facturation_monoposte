package org.TopVentes.model;

import java.text.DecimalFormat;

public interface FormatDecimalMontant {
    double determineNombreChiffreApresVirgules(String pMontant);
    boolean verifierStringIsDouble(String pEntree);

}