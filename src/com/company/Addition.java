package com.company;

/**
 * Created by Anton Ilchenko on 07.07.2017.
 */
public class Addition {
    private String name;
    private int price;
    private boolean isChosen;

    public Addition(){
        this.name ="No addition";
        this.price = 0;
        this.isChosen = false;
    }

    public Addition(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

class Lettuce extends Addition{
    public Lettuce() {
        super("Lettuce", 2);
    }

}

class Tomato extends Addition{
    public Tomato() {
        super("Tomato", 5);
    }
}

class Carrot extends Addition{
    public Carrot() {
        super("Carrot", 6);
    }
}

class Butter extends Addition{
    public Butter() {
        super("Butter", 3);
    }
}

class Onion extends Addition{
    public Onion() {
        super("Onion", 1);
    }
}

class Mayonnaise extends Addition{
    public Mayonnaise() {
        super("Mayonnaise", 7);
    }
}

class SpecialSauce extends Addition{
    public SpecialSauce() {
        super("Special. Sauce", 10);
    }
}

class Chips extends Addition{
    public Chips() {
        super("Chips", 25);
    }
    public Chips(String name, int price){
        super(name, price);
    }
}

class Drink extends Addition{
    public Drink() {
        super("Pepsi", 34);
    }
    public Drink(String name, int price){
        super(name, price);
    }
}
