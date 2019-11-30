package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public TextView debugText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        debugText= (TextView) findViewById(R.id.debugText);
        Unit Zoomer= new Unit("Gennadiy Tykalov", 200);
        Zoomer.printInfo(debugText);

        Zoomer.letsGO(debugText);

        Unit Nibber= new Robot("Egor Fomin", 1000, 400);

        Nibber.printInfo(debugText);
        Nibber.letsGO((debugText));

        Wizzard Vitalya = new Wizzard("The Great Sissak", 20, 1000);
        Vitalya.printInfo(debugText);
        Vitalya.letsGO(debugText);

        NPC npc = new NPC(12, "waiting");
        npc.printInfo(debugText);
        npc.letsGO(debugText);
    }
}