package org.TopVentes.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class FormatMontant implements FormatDecimalMontant {

    /**
     * @param pMontant à respecter le format
     * @return
     */
    @Override
    public double determineNombreChiffreApresVirgules(double pMontant) {
        NumberFormat formatMontant = NumberFormat.getCompactNumberInstance();
        formatMontant.setMaximumFractionDigits(2);
        formatMontant.setRoundingMode(RoundingMode.DOWN);

        String truncatedMontant = formatMontant.format(pMontant);

        return -1;
    }
}