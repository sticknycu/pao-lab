package org.example;


import java.util.Date;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class A {
    public static int f(int x) { return x+1; }
    public int g(int x) { return x+2; }
}
class B extends A {
    public static int f(int x) { return x+4; }
    public int g(int x) { return x+3; }
}

abstract class C1 {

    public C1() {

    }
}

class C2 extends C1 {
    public C2() {

    }
}

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Class1 class1 = new Class1();

        Class2 class2 = new Class2();

        class1.f2(); //

        class2.f2(); //

        Class1.f1();

        Class1 class3 = new Class2();

        // nestatic
        class3.f2();

        // static -> clasa din stanga
        // nestatic -> clasa din dreapta
        A a = new B();
        System.out.println(a.f(1));

        // indexarea se face de la 0
        String str = "1234567";


        System.out.println(str.substring(1));

        // nu se ia in considerare ultimul index specificat
        // este interval inchis la stanga si deschis la dreapta
        System.out.println(str.substring(0, 3));

        System.out.println(str.substring(2, 5));

        Date date = new Date();
        date.getYear();

       // Date.from(Instant.now()).getYear();


        ExecutorService executorService = Executors.newSingleThreadExecutor();

        var b1 = new CyclicBarrier(1);

        ClassThreads classThreads = new ClassThreads();

        Runnable r1 = () -> classThreads.executeCodeInOrder(b1);

        executorService.submit(r1);

        // == -> rsi equals -> obiect
    }
}

class ClassThreads {

    public void executeCodeInOrder(CyclicBarrier c1) {
        try {
            printMethod1();
            c1.await();

            printMethod2();

        } catch (BrokenBarrierException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void printMethod1() {
        System.out.println("print Method 1");
    }

    public void printMethod2() {
        System.out.println("print Method 2");
    }
}

class Class1 {
    public static void f1() {
        System.out.println("f1 in class1");
    }

    public void f2() {
        System.out.println("f2 in class1");
    }


    //public abstract void f1(); // nu merge!
}

//class Class3 {
//
//    public void f1() {
//        System.out.println("f1 in Class3");
//    }
//
//    public void f2() {
//        System.out.println("f2 in Class3");
//    }
//}

class Class2 extends Class1 {


    public static void f1() {
        System.out.println("f1 in class2");
    }

    public void f2() {
        System.out.println("f2 in class2");
    }
}

interface InterfaceClass {

    public final static Double PI = Math.PI;

   // private final static Double PI_2 = Math.PI;

  //  protected final static Double PI_3 = Math.PI;

    // default final static Double PI_4 = Math.PI;

    public void f0();

   // public static void f1();

    public static void f2() {

    }

    private void f3() {

    }

    private static void f4() {

    }

   /* protected void f5() {

    }

    protected static void f6() {

    }*/

    default void f7() {

    }

    // nu merge!
    /*
    default static void f8() {
    }
     */
}

abstract class AbstractClass {

    public abstract void f0();

    public void f1() {

    }

    public static void f2() {

    }

    private void f3() {

    }

    private static void f4() {

    }

    protected void f5() {

    }

    protected static void f6() {

    }

    // default doar in intefete
    /*default void f7() {

    }

    default static void f8() {

    }*/

}