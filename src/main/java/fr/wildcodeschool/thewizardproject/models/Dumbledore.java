package fr.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component;

@Component("Wizard")
public class Dumbledore implements WizardInterface {

    private Outfit myOutfit;

    @Override
    public String giveAdvice() {
        return "Dumbledore";
    }

    public void setOutfit(Outfit wizardDress) {
        myOutfit = wizardDress;
    }

    @Override
    public String changeDress() {
        return myOutfit.wizardDress();
    }
} 