package fr.wildcodeschool.thewizardproject.models;

public class Dumbledore implements WizardInterface {

    private Outfit myOutfit;

    @Override
    public String giveAdvice() {
        return "Test";
    }

    public void setOutfit(Outfit wizardDress) {
        myOutfit = wizardDress;
    }

    @Override
    public String changeDress() {
        return myOutfit.wizardDress();
    }
} 