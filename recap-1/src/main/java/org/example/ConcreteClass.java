package org.example;

import java.util.Objects;

public class ConcreteClass extends AbstractClass implements Interface1 {

    private Integer value;

    /*@Override
    public void getValue() {
        System.out.println("Value Triggered");
    }*/

    @Override
    public void method1() {
        System.out.println("method1 triggered");
    }

    public ConcreteClass(Integer value) {
        super(value);
        //setIntegerValue(value);
        //super.setIntegerValue(value);
        //...
    }

    public ConcreteClass(Integer integerValue, Integer value) {
        super(integerValue);
        this.value = value;
    }

    public void getValue() {
        System.out.println("value 1");
    }

    public void getValue(Integer value) {
        System.out.println("value: " + value);
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public void printStr() {
        System.out.println("print str");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConcreteClass that = (ConcreteClass) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
