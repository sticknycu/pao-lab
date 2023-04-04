package org.example;

import lombok.extern.slf4j.Slf4j;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello world!");


        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);

        var randomStream = Stream.generate(Math::random)
                .limit(100)
                        .collect(Collectors.toList());

        oddNumbers
                .limit(5)
                        .forEach(s -> System.out.println(s));

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