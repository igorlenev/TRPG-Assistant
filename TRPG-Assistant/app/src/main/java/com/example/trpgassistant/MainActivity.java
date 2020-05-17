package com.example.trpgassistant;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends FragmentActivity {

    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        DicerFragment dicerFragment = new DicerFragment();
        GameFieldFragment gameFieldFragment = new GameFieldFragment();

        fragmentTransaction.add(R.id.dicerFragmentContainer, dicerFragment);
        fragmentTransaction.add(R.id.changebleFragmentContainer, gameFieldFragment);
        fragmentTransaction.commit();
    }
}