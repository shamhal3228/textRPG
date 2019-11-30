package com.example.myapplication;

import android.widget.TextView;

public class NPC implements Runnable, Printable {
    private int id=0;
    private String state= "Waiting";

    public NPC(int id, String state){
        this.id=id;
        this.state=state;
    }

    @Override
    public void printInfo(TextView textView) {
        textView.append("NPC number "+ id + " " + state +".\n");
    }

    @Override
    public void letsGO(TextView textView) {
        textView.append("NPC number "+ id + " started moving furriously. \n");
    }
}