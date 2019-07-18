package fr.wildcodeschool.thewizardproject.models;

public class Gandalf implements WizardInterface {

    private Outfit myOutfit;

    @Override
    public String giveAdvice() {
        return "Gandalf";
    }

    public void setOutfit(Outfit wizardDress) {
        myOutfit = wizardDress;
    }

    @Override
    public String changeDress() {
        return myOutfit.wizardDress();
    }



} 