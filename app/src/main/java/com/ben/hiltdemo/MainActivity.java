package com.ben.hiltdemo;

import android.os.Bundle;
import android.util.Log;

import com.ben.hiltdemo.model.UserRepository;
import com.ben.hiltdemo.net.ApiService;
import com.ben.hiltdemo.qulifier.SecondObject;
import com.ben.hiltdemo.qulifier.TestObject;

import javax.inject.Inject;
import javax.inject.Named;

import androidx.appcompat.app.AppCompatActivity;
import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {

    @Inject
    UserRepository userRepository;

    @Inject
    ApiService apiService;

    @Inject
    MainListAdapter mainListAdapter;

    @Named("hasTag")
    @Inject
    TestObject testObject;

    @Named("noTag")
    @Inject
    TestObject testObject2;

    @Inject
    SecondObject secondObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //DaggerApplicationComponent.crete().inect(this);
        Log.i("bendeng", this.getClass().getSuperclass().getName());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("bendeng", "userRepository.toString()=" + userRepository.toString());
        Log.i("bendeng", "apiService.toString()=" + apiService.toString());
        Log.i("bendeng", "mainListAdapter.toString()=" + mainListAdapter.toString());
        Log.i("bendeng", "mainListAdapter.getActivity()=" + mainListAdapter.getActivity());
        Log.i("bendeng", "testObject.getTag()=" + testObject.getTag());
        Log.i("bendeng", "testObject2.getTag()=" + testObject2.getTag());
        Log.i("bendeng", "secondObject.getTestObject().getTag()=" + secondObject.getTestObject().getTag());
    }

}
