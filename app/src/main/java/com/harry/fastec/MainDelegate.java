package com.harry.fastec;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.harry.harry_core.delegates.LatteDelegate;

/**
 * Created by Harry on 2018/3/30.
 */
public class MainDelegate extends LatteDelegate {

    @Override
    public Object setLayout() {
        return R.layout.delegate_main;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, View rootView) {

    }
}
