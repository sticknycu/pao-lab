package org.example;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello world!");


        metoda1();
       /* try {
            int i = 300 / 0;
        } catch (ClassException e) {
            //e.printStackTrace();
        } catch (Exception e) {

        }*/
    }

    private static void metoda1() throws Exception {
        //metoda2();
    }

    private void metoda2() throws Exception {
        throw new Exception("exception");
    }
}

class ClassException extends Exception {

    public ClassException() {
        super("Exception");
    }
}

class RunException extends RuntimeException {

    public RunException() {
        super("Exceptionnn");
    }
}