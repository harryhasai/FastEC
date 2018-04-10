package com.harry.fastec;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import com.harry.harry_core.delegates.LatteDelegate;
import com.harry.harry_core.net.RestClient;
import com.harry.harry_core.net.callback.IError;
import com.harry.harry_core.net.callback.IFailure;
import com.harry.harry_core.net.callback.ISuccess;

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
        testRestClient();
    }

    private void testRestClient() {
        RestClient.builder()
                .url("http://news.baidu.com")
//                .params("", "")
                .loader(getContext())
                .success(new ISuccess() {
                    @Override
                    public void onSuccess(String response) {

                    }
                })
                .failure(new IFailure() {
                    @Override
                    public void onFailure() {

                    }
                })
                .error(new IError() {
                    @Override
                    public void onError(int code, String msg) {

                    }
                }).build()
                .get();
    }
}
