package com.example.trpgassistant;

public class Dice {
    int dice;

    public Dice (int dice){
        this.dice = dice;
        return;
    }

    public int drawDice (int dice){
        return (int)Math.random()*dice;
    }
}