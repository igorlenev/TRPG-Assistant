package com.example.trpgassistant;

import android.content.Context;
import android.view.View;
import android.view.ViewManager;
import android.view.ViewParent;

public abstract class ViewGroup extends View implements ViewParent, ViewManager {

    public ViewGroup(Context context) {
        super(context);
    }
}