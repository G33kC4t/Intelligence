package com.g33kc4t.intelligence.core;

import android.app.Application;

public class AppCore {

    static AppCore _instance;

    public static AppCore getInstance() {
        return _instance;
    }

    public static Application getApplication() {
        return getInstance().application;
    }

    private final G33kC4tApplication application;

    public AppCore(G33kC4tApplication application) {
        this.application = application;
    }
}
