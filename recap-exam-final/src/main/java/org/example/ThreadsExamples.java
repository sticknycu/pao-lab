package org.example;


import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ThreadsExamples extends Thread {

    public static Set<Integer> setInteger = new HashSet<>();

    public volatile static Integer counter = 0;

    @Override
    public synchronized void run() {
        if (counter < 100) {
            counter++;
        }

        if (counter == 11) {
            counter = counter * 2;
        }

        if (counter == 22) {
            // conditie de oprire thread
        }
    }
}
