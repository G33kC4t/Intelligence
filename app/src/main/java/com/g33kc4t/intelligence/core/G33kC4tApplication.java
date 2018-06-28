package com.g33kc4t.intelligence.core;

import android.app.Application;

public class G33kC4tApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AppCore._instance = new AppCore(this);
    }
}
