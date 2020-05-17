package com.example.trpgassistant;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import fr.arnaudguyon.smartgl.opengl.SmartGLView;
import fr.arnaudguyon.smartgl.opengl.SmartGLViewController;
import fr.arnaudguyon.smartgl.touch.TouchHelperEvent;

public class GameFieldFragment extends Fragment implements SmartGLViewController {
    private Button optionsButton;
    private Button chooseBackgroundButton;
    private Button addCharacterButton;
    private ConstraintLayout optionsList;
    private Activity activity;
    private boolean isListOpen;
    private SmartGLView mSmartGLView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.game_field_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mSmartGLView = getView().findViewById(R.id.smartGLView);
        mSmartGLView.setDefaultRenderer(getContext());
        mSmartGLView.setController(this);

        optionsButton = getView().findViewById(R.id.optionsButton);
        chooseBackgroundButton = getView().findViewById(R.id.chooseBackgroundButton);
        addCharacterButton = getView().findViewById(R.id.addCharacterButton);
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

        chooseBackgroundButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //android.provider.MediaStore.get
            }
        });

        addCharacterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public void onPrepareView(SmartGLView smartGLView) {

    }

    @Override
    public void onReleaseView(SmartGLView smartGLView) {

    }

    @Override
    public void onResizeView(SmartGLView smartGLView) {

    }

    @Override
    public void onTick(SmartGLView smartGLView) {

    }

    @Override
    public void onTouchEvent(SmartGLView smartGLView, TouchHelperEvent event) {

    }
}