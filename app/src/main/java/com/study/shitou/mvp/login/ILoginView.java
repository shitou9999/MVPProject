package com.study.shitou.mvp.login;

/**
 * 用途：
 *
 * @author: shitou
 * @date: 2016-12-07 11:15
 */
public interface ILoginView {

//    当Presenter层调用loginToServer (String name ,String password)方法时，要通过该方法通知View层显示加载动画。
    void showProgress(boolean enable);

//    登陆成功时，Presenter层会通过该方法通知View层登陆已成功。
    void showLoginView();

}
