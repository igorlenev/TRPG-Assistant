package com.example.trpgassistant;

import androidx.appcompat.app.AppCompatActivity;

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

    public String getCurrentTime(){
        return java.time.LocalTime.now().toString();
    }

    public String getDiceText (){
        summaryRandom = 0;
        diceText = "[" + numberOfEdges + "]" + " * " + numberOfDices;
        if (modifier!=0){diceText = diceText + " + " + modifier;}
        diceText += " = [";
        for (int i=0; i<numberOfDices; i++){
            temporaryRandom = (int)(Math.random()*numberOfEdges+1);
            diceText = diceText + temporaryRandom;
            summaryRandom = summaryRandom + temporaryRandom;
            if(i<numberOfDices-1){diceText = diceText + " + ";}
        }
        diceText = diceText + "]";
        if (modifier!=0){diceText = diceText + " + " + modifier;}
        diceText += " = " + (summaryRandom+modifier);
        return diceText;
    }
}