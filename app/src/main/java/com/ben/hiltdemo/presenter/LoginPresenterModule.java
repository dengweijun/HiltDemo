package com.ben.hiltdemo.presenter;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;

@InstallIn(ActivityComponent.class)
@Module
public abstract class LoginPresenterModule {

    @Binds
    public abstract LoginPresenter bindLoginPresenter(LoginPresenterImpl loginPresenter);

}
