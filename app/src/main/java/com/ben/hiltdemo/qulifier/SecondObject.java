package com.ben.hiltdemo.qulifier;

import javax.inject.Inject;
import javax.inject.Named;

public class SecondObject {

    private TestObject testObject;

    @Inject
    public SecondObject(@Named("hasTag") TestObject testObject) {
        this.testObject = testObject;
    }

    public TestObject getTestObject() {
        return testObject;
    }

}
