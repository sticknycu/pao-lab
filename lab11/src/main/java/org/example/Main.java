package org.example;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        new ProducerConsumerProblem().solveProblem();
    }
}

class ProducerConsumerProblem {
    LinkedList<Integer> buffer = new LinkedList<>();
    int capacity = 2; // Size of the buffer

    ReentrantLock lock = new ReentrantLock(true);
    Condition bufferNotFull = lock.newCondition();
    Condition bufferNotEmpty = lock.newCondition();

    class Producer extends Thread {
        public void run() {
            for (int i = 0; i < 10; i++) {
                lock.lock();
                try {
                    while (buffer.size() == capacity) {
                        // Wait until the buffer is not full
                        bufferNotFull.await();
                    }
                    buffer.add(i);
                    System.out.println("Produced " + i);
                    // Signal that the buffer is not empty now
                    bufferNotEmpty.signalAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        }
    }

    class Consumer extends Thread {
        public void run() {
            while (true) {
                lock.lock();
                try {
                    while (buffer.size() == 0) {
                        // Wait until the buffer is not empty
                        bufferNotEmpty.await();
                    }
                    Integer value = buffer.poll();
                    if (value != null) {
                        System.out.println("Consumed " + value);
                        // Signal that the buffer may be empty now
                        bufferNotFull.signalAll();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        }
    }

    public void solveProblem() {
        new Producer().start();
        new Consumer().start();
    }
}