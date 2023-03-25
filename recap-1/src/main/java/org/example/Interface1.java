package org.example;

public interface Interface1 {

    Double PI_NUMBER = 3.14;

    void method1();

    default void method2() {
        System.out.println("Method2");
    }
}

interface Interface2 {

}

interface Interface3 extends Interface1, Interface2 {

}