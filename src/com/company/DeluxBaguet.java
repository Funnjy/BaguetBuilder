package com.company;
/**
 * Created by Anton Ilchenko on 07.07.2017.
 */
public class DeluxBaguet extends Baguet{
    public DeluxBaguet(String breadType, String meat) {
        super(breadType, meat,2, 75);
        super.addAdditions(new Chips("Pringles", 20));
        super.addAdditions(new Drink("Pepsi", 35));
    }
}
