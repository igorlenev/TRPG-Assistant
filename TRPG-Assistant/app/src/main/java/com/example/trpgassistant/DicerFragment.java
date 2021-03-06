package com.example.trpgassistant;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DicerFragment extends Fragment {
    private Button generateButton;
    private EditText numberOfEdgesField;
    private EditText numberOfDicesField;
    private EditText modifierField;
    private int numberOfEdges;
    private int numberOfDices;
    private int modifier;
    private Activity activity;
    private RecyclerView dicerLogRecyclerView;
    private ArrayList<Dice> dices = new ArrayList<Dice>();
    private DicerLogAdapter dicerLogAdapter = new DicerLogAdapter(dices);

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      return inflater.inflate(R.layout.dicer_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        numberOfEdgesField = getView().findViewById(R.id.numberOfEdges);
        numberOfDicesField = getView().findViewById(R.id.numberOfDices);
        modifierField = getView().findViewById(R.id.modifier);
        generateButton = getView().findViewById(R.id.generateButton);
        activity = getActivity();

        dicerLogRecyclerView = getView().findViewById(R.id.dicerLog);
        dicerLogRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        dicerLogRecyclerView.setAdapter(dicerLogAdapter);
        dicerLogRecyclerView.setItemAnimator(new DefaultItemAnimator());

        generateButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (numberOfEdgesField.getText().toString().isEmpty()) {numberOfEdges = 0;}
                    else {numberOfEdges = Integer.valueOf(numberOfEdgesField.getText().toString());}
                    if (numberOfDicesField.getText().toString().isEmpty()) {numberOfDices = 1; }
                    else {numberOfDices = Integer.valueOf(numberOfDicesField.getText().toString());}
                    if (modifierField.getText().toString().isEmpty()) {modifier = 0;}
                    else {modifier = Integer.valueOf(modifierField.getText().toString());}

                    dicerLogAdapter.addDice(new Dice(numberOfEdges, numberOfDices, modifier));
                    dicerLogRecyclerView.smoothScrollToPosition(dicerLogRecyclerView.getAdapter().getItemCount() - 1);
                }
            });
    }
}