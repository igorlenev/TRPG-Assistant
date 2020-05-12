package com.example.trpgassistant;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

public class SheetsFragment extends Fragment {
    private Button optionsButton;
    private ConstraintLayout optionsList;
    private Activity activity;
    private boolean isListOpen;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.sheets_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        optionsButton = getView().findViewById(R.id.optionsButton);
        optionsList = getView().findViewById(R.id.optionsList);
        isListOpen = false;
        activity = getActivity();

        optionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isListOpen){
                    optionsList.setVisibility(View.INVISIBLE);
                    isListOpen = false;
                }
                else {
                    optionsList.setVisibility(View.VISIBLE);
                    isListOpen = true;
                }
            }
        });
    }
}