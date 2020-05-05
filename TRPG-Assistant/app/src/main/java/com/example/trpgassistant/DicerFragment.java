package com.example.trpgassistant;

import android.app.Activity;
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
    private EditText numberOfDicesField;
    private EditText modifierField;
    private Activity activity;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dicer_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        numberOfEdgesField = getView().findViewById(R.id.numberOfEdges);
        numberOfDicesField = getView().findViewById(R.id.numberOfDices);
        modifierField = getView().findViewById(R.id.modifier);
        generateButton = getView().findViewById(R.id.generateButton);
        activity = getActivity();

        super.onCreate(savedInstanceState);

        generateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity, new Dice(Integer.valueOf(numberOfEdgesField.getText().toString()), Integer.valueOf(numberOfDicesField.getText().toString()), Integer.valueOf(modifierField.getText().toString())).generateDice(), Toast.LENGTH_LONG).show();
            }
        });
    }
}