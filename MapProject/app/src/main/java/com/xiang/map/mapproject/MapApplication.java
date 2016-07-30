package com.xiang.map.mapproject;

import android.app.Application;

public class MapApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        MapUtil.init(getApplicationContext());
    }
}
