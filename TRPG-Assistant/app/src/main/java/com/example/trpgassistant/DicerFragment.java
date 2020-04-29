package com.example.trpgassistant;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import com.example.trpgassistant.dice.Dice;

public class DicerFragment extends FragmentActivity {
    private Button generateButton;
    private EditText numberOfEdges;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberOfEdges = findViewById(R.id.numberOfEdges);
        generateButton = findViewById(R.id.generateButton);
        generateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(DicerFragment.this, new Dice(Integer.valueOf(numberOfEdges.getText().toString())).generateDice(), Toast.LENGTH_LONG);
                toast.show();
            }
        });
    }
}