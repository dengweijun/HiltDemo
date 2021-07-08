package com.ben.hiltdemo.model;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.hilt.android.scopes.ActivityScoped;

@ActivityScoped
public class UserRepository {

    private final UserRemoteSource userRemoteSource;

    @Inject
    public UserRepository(UserRemoteSource userRemoteSource) {
        this.userRemoteSource = userRemoteSource;
    }

}
