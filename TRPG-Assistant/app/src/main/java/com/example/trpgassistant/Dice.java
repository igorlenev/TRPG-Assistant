package com.example.trpgassistant;

import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.trpgassistant.R;

public class Dice extends AppCompatActivity {
    int dice;

    public Dice (int dice){
        this.dice = dice;
        return;
    }

    public String generateDice (){
        return String.valueOf((int)(Math.random()*dice+1));
    }
}