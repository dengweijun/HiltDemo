package com.ben.hiltdemo.qulifier;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;

@InstallIn(ActivityComponent.class)
@Module
public class TestObjectModule {

    @Named("hasTag")
    @Provides
    public TestObject provideTestObject() {
        return new TestObject("bendeng");
    }

    @Named("noTag")
    @Provides
    public TestObject provideTestObject2() {
        return new TestObject();
    }

}
