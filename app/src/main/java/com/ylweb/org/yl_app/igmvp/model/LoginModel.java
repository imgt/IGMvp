package com.ylweb.org.yl_app.igmvp.model;

/**
 * Created by Administrator on 2017/9/14.
 */

import com.ylweb.org.yl_app.igmvp.presenter.OnLoginFinishedListener;

/**
 * Created by Anthony on 2016/2/15.
 * Class Note:模拟登陆的操作的接口，实现类为LoginModelImpl.相当于MVP模式中的Model层
 */
public interface LoginModel {
    void login(String username, String password, OnLoginFinishedListener listener);
}