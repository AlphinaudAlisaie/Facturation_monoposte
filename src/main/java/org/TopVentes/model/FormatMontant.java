package org.TopVentes.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class FormatMontant implements FormatDecimalMontant {

    /**
     * Methode pour determiner le format d'un montant
     *
     * @param pMontant à respecter le format
     * @return format correctement
     */
    @Override
    public double determineNombreChiffreApresVirgules(String pMontant) {
        if(verifierStringIsDouble(pMontant))

        return -1;
    }

    /**
     * Methode pour vérifier si le String est un double
     * @param pEntree par comptable
     * @return vrai si le string en param est un double
     */
    @Override
    public boolean verifierStringIsDouble(String pEntree){
        boolean isDouble= false;
        try{
            Double doubleNumber = Double.valueOf(pEntree);
            isDouble = true;
        }catch (NumberFormatException e){
            System.out.println("L'entree en String n'est pas un nombre double!");
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return isDouble;
    }



}