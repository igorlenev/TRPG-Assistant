package com.example.trpgassistant;

import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.trpgassistant.R;

public class Dice extends AppCompatActivity {
    int numberOfEdges;

    public Dice (int numberOfEdges){
        this.numberOfEdges = numberOfEdges;
        return;
    }

    public String generateDice (){
        return String.valueOf((int)(Math.random()*numberOfEdges+1));
    }
}