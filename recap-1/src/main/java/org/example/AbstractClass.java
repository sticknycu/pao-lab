package org.example;

public abstract class AbstractClass {

    Double PI_NUMBER = 3.14;

    private Integer integerValue;

    public void setIntegerValue(Integer integerValue) {
        this.integerValue = integerValue;
    }

    protected AbstractClass(Integer integerValue) {
        this.integerValue = integerValue;
    }

    public void getValue() {
        System.out.println("Base class");
    }

    public String getValueString() {
        return "valueString";
    }
}
