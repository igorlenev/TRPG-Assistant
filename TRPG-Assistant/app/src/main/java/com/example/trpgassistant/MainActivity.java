package com.example.trpgassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.trpgassistant.dice.Dice;

public class MainActivity extends AppCompatActivity {
    private Button drawButton;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.numberOfEdges);
        drawButton = findViewById(R.id.drawButton);
        drawButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(MainActivity.this, new Dice(Integer.valueOf(editText.getText().toString())).generateDice(), Toast.LENGTH_LONG);
                toast.show();
            }
        });
    }
}