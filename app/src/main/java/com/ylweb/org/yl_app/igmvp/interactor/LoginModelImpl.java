package com.ylweb.org.yl_app.igmvp.interactor;

/**
 * Created by Administrator on 2017/9/14.
 */

import android.os.Handler;
import android.text.TextUtils;

import com.ylweb.org.yl_app.igmvp.model.LoginModel;
import com.ylweb.org.yl_app.igmvp.presenter.OnLoginFinishedListener;

/**
 * Created by Anthony on 2016/2/15.
 * Class Note:延时模拟登陆（2s），如果名字或者密码为空则登陆失败，否则登陆成功
 */
public class LoginModelImpl implements LoginModel {

    @Override
    public void login(final String username, final String password, final OnLoginFinishedListener listener) {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                boolean error = false;
                if (TextUtils.isEmpty(username)) {
                    listener.onUsernameError();//model层里面回调listener
                    error = true;
                }
                if (TextUtils.isEmpty(password)) {
                    listener.onPasswordError();
                    error = true;
                }
                if (!error) {
                    listener.onSuccess();
                }
            }
        }, 2000);
    }
}