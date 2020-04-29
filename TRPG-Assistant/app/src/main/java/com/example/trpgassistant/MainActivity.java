package com.example.trpgassistant;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.trpgassistant.dice.Dice;

public class MainActivity extends FragmentActivity {
    private Button generateButton;
    private EditText numberOfEdges;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberOfEdges = findViewById(R.id.numberOfEdges);
        generateButton = findViewById(R.id.generateButton);
        generateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(MainActivity.this, new Dice(Integer.valueOf(numberOfEdges.getText().toString())).generateDice(), Toast.LENGTH_LONG);
                toast.show();
            }
        });
    }
}