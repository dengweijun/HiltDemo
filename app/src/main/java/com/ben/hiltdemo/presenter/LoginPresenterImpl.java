package com.ben.hiltdemo.presenter;

import android.util.Log;

import javax.inject.Inject;

public class LoginPresenterImpl implements LoginPresenter {

    @Inject
    public LoginPresenterImpl() {
    }

    @Override
    public void login() {
        Log.i("bendeng", "用户正在登陆...");
    }
}
