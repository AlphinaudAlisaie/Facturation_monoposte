package org.TopVentes.model;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ChangeListener;

/**
 * Facturation available for opening (the company owns two of them without further acquisitions foreseen). Once a machine is opened, it cannot be closed.
 * @learning It is ok for the model to hold the isMachine2Demanded attribute, because the model will change with same cycles as controllers (and you can substitute them without changing the model). Command line would still work but ex. a previous command would be needed to open second machine before command to use second machine would be functional, or opening could be used whenever command is used.
 */
public class FacturationLot {
    private final BooleanProperty isFacturation1Demanded = new SimpleBooleanProperty();

    public void setIsFacturation1Demanded(boolean isFacturation1Demanded){
        this.isFacturation1Demanded.setValue(isFacturation1Demanded);
    }

    public void handleOpeningOfMachineTwo(ChangeListener<Boolean> handleOpeningOfMachineTwo) {
        isFacturation1Demanded.addListener(handleOpeningOfMachineTwo);
    }
}
