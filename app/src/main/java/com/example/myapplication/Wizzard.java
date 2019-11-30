package com.example.myapplication;

import android.widget.TextView;

public class Wizzard extends Unit implements Printable, Runnable{
    private int mana;
    public Wizzard(String name, int health, int mana) {
        super(name, health);
        this.mana=mana;
    }

    @Override
    public void printInfo(TextView textPlace) {
        super.printInfo(textPlace);
        textPlace.append(getName() + " have " + mana +" mana. \n");
    }

    @Override
    public void letsGO(TextView textPlace) {
        mana-=20;
        textPlace.append(getName() + " teleported. Now he has " + mana + " mana. \n");
    }
}