package com.example.trpgassistant;

import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.trpgassistant.R;

public class Dice extends AppCompatActivity {
    int numberOfEdges;
    int summaryRandom;
    int temporaryRandom;
    int numberOfDices;
    int modifier;
    String diceText;

    public Dice (int numberOfEdges, int numberOfDices, int modifier){
        this.numberOfEdges = numberOfEdges;
        this.numberOfDices = numberOfDices;
        this.modifier = modifier;
        return;
    }

    public String generateDice (){
        diceText = "[" + numberOfEdges + "]" + "*" + numberOfDices + "+" + modifier + "=[";
        for (int i=0; i<numberOfDices; i++){
            temporaryRandom = (int)(Math.random()*numberOfEdges+1);
            diceText = diceText + temporaryRandom;
            summaryRandom = summaryRandom + temporaryRandom;
            if(i<numberOfDices-1){diceText = diceText + "+";}
        }
        diceText = diceText + "]+" + modifier + "=" + (summaryRandom+modifier);
        return diceText;
    }
}