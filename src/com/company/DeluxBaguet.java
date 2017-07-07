package com.company;
/**
 * Created by Anton Ilchenko on 07.07.2017.
 */
public class DeluxBaguet extends Baguet{
    public DeluxBaguet(String breadType, String meat) {
        super(breadType, meat,2, 75);
    }

    public void setAdditions(Addition ad1, Addition ad2) {
        setAdditions(ad1);
        chosenAdditionsInc();
        setAdditions(ad2);
        chosenAdditionsInc();
    }
}
