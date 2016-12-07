package com.study.shitou.mvp.login;

/**
 * 用途：登录-----M、V、P接口文件和接口的对应实现
 * @author: shitou
 * @date: 2016-12-07 11:10
 */
public interface ILoginModel {
//登陆方法，通过该方法向服务器发送登陆请求。
    void login(String name,String password);

}
