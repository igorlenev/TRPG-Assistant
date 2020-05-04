package com.example.trpgassistant;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends FragmentActivity {
    private Button generateButton;
    private EditText numberOfEdges;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        DicerFragment dicerFragment = new DicerFragment();
        fragmentTransaction.add(R.id.dicerFragmentContainer, dicerFragment);
        fragmentTransaction.commit();

        /*numberOfEdges = findViewById(R.id.numberOfEdges);
        generateButton = findViewById(R.id.generateButton);
        generateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(MainActivity.this, new Dice(Integer.valueOf(numberOfEdges.getText().toString())).generateDice(), Toast.LENGTH_LONG);
                toast.show();
            }
        });*/
    }
}