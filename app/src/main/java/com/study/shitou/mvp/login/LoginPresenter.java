package com.study.shitou.mvp.login;

/**
 * 用途：
 *
 * @author: shitou
 * @date: 2016-12-07 11:26
 */
public class LoginPresenter implements ILoginPresenter {
    private static final String TAG = "LoginPresenter";

    private ILoginModel mLoginModel;
    private ILoginView mLoginView;

    public LoginPresenter(ILoginView loginView) {
        this.mLoginView = loginView;
        this.mLoginModel = new LoginModel(this);
    }

    public LoginPresenter(ILoginModel loginModel, ILoginView loginView) {
        this.mLoginModel = loginModel;
        this.mLoginView = loginView;
    }


    @Override
    public void loginToServer(String uername, String password) {
        //连接view和model层
        mLoginView.showProgress(true);
        mLoginModel.login(uername, password);
    }

    @Override
    public void loginSucceed() {
        mLoginView.showProgress(false);
        mLoginView.showLoginView();
    }




}
