package com.harry.harry_core.util;

import android.content.res.Resources;
import android.util.DisplayMetrics;

import com.harry.harry_core.app.Latte;

/**
 * Created by Harry on 2018/4/9.
 */
public class DimenUtil {

    public static int getScreenWidth() {
        final Resources resources = Latte.getApplication().getResources();
        final DisplayMetrics dm = resources.getDisplayMetrics();
        return dm.widthPixels;
    }

    public static int getScreenHeight() {
        final Resources resources = Latte.getApplication().getResources();
        final DisplayMetrics dm = resources.getDisplayMetrics();
        return dm.heightPixels;
    }
}
