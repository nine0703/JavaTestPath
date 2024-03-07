package com.test.main.lanhans;

public class TestOperation {
    private static final TestOperation ts = new TestOperation();

    private TestOperation() {
    }
    public static TestOperation getInterprate(){
        return ts;
    }
}
