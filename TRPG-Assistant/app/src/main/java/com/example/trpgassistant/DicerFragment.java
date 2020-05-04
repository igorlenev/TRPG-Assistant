package com.example.trpgassistant;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

public class DicerFragment extends Fragment {
    private Button generateButton;
    private EditText numberOfEdgesField;
    private int numberOfEdges;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dicer_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        numberOfEdgesField = getView().findViewById(R.id.numberOfEdges);
        generateButton = getView().findViewById(R.id.generateButton);
        numberOfEdges = getView().Integer.valueOf(numberOfEdges.getText().toString())).generateDice();
    }

    @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            generateButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast toast = Toast.makeText(DicerFragment.this, new Dice(Integer.valueOf(numberOfEdges.getText().toString())).generateDice(), Toast.LENGTH_LONG).show();
                }
            });
        }
}