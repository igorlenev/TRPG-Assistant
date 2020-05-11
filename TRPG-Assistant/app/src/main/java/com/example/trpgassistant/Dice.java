package com.example.trpgassistant;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Dice extends AppCompatActivity {
    int numberOfEdges;
    int summaryRandom;
    int temporaryRandom;
    int numberOfDices;
    int modifier;
    String temporaryDiceText;
    String diceText;
    String diceTime;

    public Dice (int numberOfEdges, int numberOfDices, int modifier){
        this.numberOfEdges = numberOfEdges;
        this.numberOfDices = numberOfDices;
        this.modifier = modifier;
        diceText = getTemporaryDiceText();
        diceTime = getCurrentTime();
        return;
    }

    public String getCurrentTime(){
        return java.time.LocalTime.now().toString();
    }

    public String getText(){return diceText;}

    public String getTime(){return diceTime;}

    public String getTemporaryDiceText (){
        summaryRandom = 0;
        temporaryDiceText = "[" + numberOfEdges + "]" + " * " + numberOfDices;
        if (modifier!=0){temporaryDiceText += " + " + modifier;}
        temporaryDiceText += " = [";
        for (int i=0; i<numberOfDices; i++){
            temporaryRandom = (int)(Math.random()*numberOfEdges+1);
            temporaryDiceText += temporaryRandom;
            summaryRandom = summaryRandom + temporaryRandom;
            if(i<numberOfDices-1){temporaryDiceText += " + ";}
        }
        temporaryDiceText += "]";
        if (modifier!=0){temporaryDiceText += " + " + modifier;}
        temporaryDiceText += " = " + (summaryRandom+modifier);
        return temporaryDiceText;
    }
}