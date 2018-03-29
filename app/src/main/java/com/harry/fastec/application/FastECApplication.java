package com.harry.fastec.application;

import android.app.Application;

import com.harry.harry_core.app.Latte;

/**
 * Created by Harry on 2018/3/29.
 */
public class FastECApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Latte.init(this)
                .withApiHost("http://127.0.0.1")
                .configure();
    }
}
