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
    //String dicerLog[] = new String [20];
    //String temporaryText;
    //boolean logTrigger=false;

    public Dice (int numberOfEdges, int numberOfDices, int modifier){
        this.numberOfEdges = numberOfEdges;
        this.numberOfDices = numberOfDices;
        this.modifier = modifier;
        return;
    }

    /*public String[] updateDicerLog (String diceText){
        if(!logTrigger) {
            for (int i = 0; i < 19; i++) {
                if (dicerLog[i] == null) {
                    dicerLog[i] = diceText;
                    logTrigger = true;
                    break;
                }
            }
        }
        else {
            for (int i = 19; i>0; i--){
                temporaryText = dicerLog[i];
                dicerLog[i] = diceText;
                dicerLog[i-1] = temporaryText;
            }
        }
        return dicerLog;
    }*/

    public String getDiceText(){
        return this.diceText;
    }

    public String getCurrentTime(){
        return java.time.LocalTime.now().toString();
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
        //updateDicerLog(diceText);
        return diceText;
    }
}