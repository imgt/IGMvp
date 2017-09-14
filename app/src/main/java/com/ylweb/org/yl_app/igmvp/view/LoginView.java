package com.ylweb.org.yl_app.igmvp.view;

/**
 * Created by Administrator on 2017/9/14.
 */
/**
 * Created by Anthony on 2016/2/15.
 * Class Note:登陆View的接口，实现类也就是登陆的activity
 */
public interface LoginView {
    void showProgress();

    void hideProgress();

    void setUsernameError();

    void setPasswordError();

    void navigateToHome();
}