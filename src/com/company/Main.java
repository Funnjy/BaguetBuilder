package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Butter butter = new Butter(); //3
        Carrot carrot = new Carrot(); //6
        Lettuce lettuce = new Lettuce(); //2
        Mayonnaise mayonnaise = new Mayonnaise(); //7
        Onion onion = new Onion(); //1
        SpecialSauce specialSauce = new SpecialSauce(); //10
        Tomato tomato = new Tomato(); //5
        Drink pepsi = new Drink();
        Chips pringles = new Chips();

        Baguet baguet = new Baguet("Grov", "kylling");
        System.out.println("Base price of Baguet is " + baguet.getBasePrice() + " crowns");
        baguet.addAdditions(butter);
        baguet.addAdditions(lettuce);
        baguet.addAdditions(tomato);
        baguet.addAdditions(tomato);
        System.out.println("Final price with " + baguet.getChosenAdditions() + " additions is " + baguet.finalPrice() + " crowns");

        HelthyBaguet hBaguett = new HelthyBaguet("Storfe");
        System.out.println("Base price of HelthyBaguet is " + hBaguett.getBasePrice() + " crowns");
        hBaguett.addAdditions(onion);
        hBaguett.addAdditions(onion);
        hBaguett.addAdditions(onion);
        hBaguett.addAdditions(onion);
        hBaguett.addAdditions(onion);
        hBaguett.addAdditions(onion);
        System.out.println("Final price with " + hBaguett.getChosenAdditions() + " additions is " + hBaguett.finalPrice() + " crowns");

        DeluxBaguet deluxBaguet = new DeluxBaguet("Hvit", "Elg");
        System.out.println("Base price of Delux baguett is " + deluxBaguet.getBasePrice() + " crowns");
        System.out.println("Final price with " + deluxBaguet.getChosenAdditions() + " additions is " + deluxBaguet.finalPrice() + " crowns");
    }
}
