package com.example.trpgassistant;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        DicerFragment dicerFragment = new DicerFragment();
        SheetsFragment sheetsFragment = new SheetsFragment();

        fragmentTransaction.add(R.id.dicerFragmentContainer, dicerFragment);
        fragmentTransaction.add(R.id.changebleFragmentContainer, sheetsFragment);
        fragmentTransaction.commit();
    }
}