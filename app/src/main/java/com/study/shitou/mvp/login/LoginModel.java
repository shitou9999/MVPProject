package com.study.shitou.mvp.login;

import android.os.Handler;
import android.util.Log;

/**
 * 用途：接口具体实现
 * @author: shitou
 * @date: 2016-12-07 11:22
 */
public class LoginModel implements ILoginModel{
    private static final String TAG = "LoginModel";
    private Handler mHandler=new Handler();
    private ILoginPresenter mPresenter;

    public LoginModel(ILoginPresenter presenter) {
        this.mPresenter=presenter;
    }

    @Override
    public void login(String name, String password) {
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Log.d("TAG", "run: ");
                mPresenter.loginSucceed();
            }
        },2000);
    }
}
