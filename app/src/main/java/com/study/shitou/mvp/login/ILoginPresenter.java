package com.study.shitou.mvp.login;

/**
 * 用途：
 * @author: shitou
 * @date: 2016-12-07 11:14
 */
public interface ILoginPresenter {

//    通知Model响应登陆事件。
    void loginToServer(String uername,String password);

//    当登陆事件完成时（成功/失败），Model层要通知该方法登陆事件已完成。
    void loginSucceed();

}
