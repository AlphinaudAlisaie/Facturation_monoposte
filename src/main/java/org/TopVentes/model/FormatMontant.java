package org.TopVentes.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class FormatMontant implements FormatDecimalMontant {

    /**
     * Methode pour créer le format montant
     * @param pMontant en param
     * @return le format décimal désiré
     */
    public DecimalFormat creerFormatMontant(double pMontant){
        return new DecimalFormat("#.##");
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
            if(doubleNumber >=0.00){
                isDouble = true;
            }

        }catch (NumberFormatException e){
            System.out.println("L'entree en String n'est pas un nombre double!");
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return isDouble;
    }

    /**
     * Methode servant
     * @param pMontant string entree par utilisateur
     * @return pMontant en tant que double
     */
    public double changerStringToDouble(String pMontant){
        double number=0;
        if(verifierStringIsDouble(pMontant)){
            number = Double.parseDouble(pMontant);
        }
        return number;
    }



}