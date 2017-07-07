package com.company;

import sun.awt.geom.AreaOp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anton Ilchenko on 07.07.2017.
 */
public class Baguet {
    private String breadType;
    private String meat;

    private List<Addition> additions = new ArrayList<>();

    private int maksAdditions;
    private int chosenAdditions;
    private int basePrice;
    private int finalPrice;

    public Baguet(String breadType, String meat) {
        this.breadType = breadType;
        this.meat = meat;
        this.maksAdditions = 4;
        this.chosenAdditions = 0;
        this.basePrice = 45;
        this.finalPrice = basePrice;
        additions = new ArrayList<>();
    }

    public Baguet(String breadType, String meat,
                  int maksAdditions, int basePrice) {
        this.breadType = breadType;
        this.meat = meat;
        this.additions = new ArrayList<>();
        this.maksAdditions = maksAdditions;
        this.chosenAdditions = 0;
        this.basePrice = basePrice;

    }

    public void addAdditions(Addition addition) {
        if (chosenAdditions != maksAdditions) {
            additions.add(addition);
            chosenAdditionsInc();
        } else
            System.out.println("Maks additions for this type of baguett");

    }

    public int finalPrice() {
        finalPrice = 0;
        finalPrice += basePrice;

        if (additions.isEmpty() || chosenAdditions == 0)
            return getFinalPrice();
        for (int i = 0; i < chosenAdditions; i++) {
            finalPrice += additions.get(i).getPrice();
        }
        return finalPrice;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public int getFinalPrice() {
        if (this.finalPrice == 0)
            return finalPrice +basePrice;
        else
            return finalPrice;
    }

    public int getChosenAdditions() {
        return chosenAdditions;
    }

    public List<Addition> getAdditions() {
        return additions;
    }


    public void chosenAdditionsInc() {
        this.chosenAdditions ++;
    }

    public void setAdditions(Addition addition) {
        getAdditions().add(addition);
    }
}
