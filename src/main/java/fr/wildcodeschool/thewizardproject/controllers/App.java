package fr.wildcodeschool.thewizardproject.controllers;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import fr.wildcodeschool.thewizardproject.models.Outfit;
import fr.wildcodeschool.thewizardproject.models.Dumbledore;
import fr.wildcodeschool.thewizardproject.models.WizardInterface;

public class App {

    public void start() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");

        WizardInterface myWizardInterface = context.getBean("Wizard", WizardInterface.class);

        context.close();

        Dumbledore WizardInterface = new Dumbledore();
        System.out.println("");
        System.out.println("******************");
        System.out.println(myWizardInterface.giveAdvice());
        System.out.println("******************");
        Outfit myOutfit = new Outfit();
        WizardInterface.setOutfit(myOutfit);
        System.out.println(WizardInterface.changeDress());
    }
}