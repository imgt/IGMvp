package com.ylweb.org.yl_app.igmvp.presenter;

/**
 * Created by Administrator on 2017/9/14.
 */

/**
 * Created by Anthony on 2016/2/15.
 * Class Note:登陆事件监听
 */
public interface OnLoginFinishedListener {

    void onUsernameError();

    void onPasswordError();

    void onSuccess();
}
