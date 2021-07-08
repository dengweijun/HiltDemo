package com.ben.hiltdemo;

import android.app.Activity;

import javax.inject.Inject;

public class MainListAdapter {

    /*private final Context context;

    @Inject
    public MainListAdapter(@ActivityContext Context context) {
        this.context = context;
    }*/

    private final Activity activity;

    @Inject
    public MainListAdapter(Activity activity) {
        this.activity = activity;
    }

    public Activity getActivity() {
        return activity;
    }
}
