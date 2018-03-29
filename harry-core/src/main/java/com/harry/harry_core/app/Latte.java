package com.harry.harry_core.app;

import android.content.Context;

import java.util.WeakHashMap;

/**
 * Created by Harry on 2018/3/29.
 */
public final class Latte {

    public static Configurator init(Context context) {
        getConfiguration().put(ConfigType.APPLICATION_CONTEXT.name(), context.getApplicationContext());
        return Configurator.getInstance();
    }

    private static WeakHashMap<String, Object> getConfiguration() {
        return Configurator.getInstance().getLatteConfigs();
    }
}
