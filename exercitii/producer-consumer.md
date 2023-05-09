##### Producer-Consumer Problem

The producer-consumer problem, also known as the bounded-buffer problem, is a classic example of a multi-process synchronization problem. This problem describes two kinds of threads, producers and consumers, who share a common, fixed-size buffer as a queue.

Producers are the threads which produce some data and put it into the buffer. Consumers, on the other hand, consume the data, meaning they remove it from the buffer. The problem is to make sure that a producer doesn't try to add data into the buffer if it's full and that a consumer doesn't try to remove data from an empty buffer.

```java
public class ProducerConsumerProblem {
    LinkedList<Integer> buffer = new LinkedList<>();
    int capacity = 2; // Size of the buffer

    ReentrantLock lock = new ReentrantLock(true);
    Condition bufferNotFull  = lock.newCondition();
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

    public static void main(String[] args) {
        new ProducerConsumerProblem().solveProblem();
    }
}
```

In this example, ReentrantLock is used to control access to the shared buffer, and Condition variables are used to communicate between the producer and consumer threads. When the buffer is full, the producer thread waits until it's not full before adding to it. Similarly, when the buffer is empty, the consumer thread waits until it's not empty before attempting to remove from it.

The Condition.await() method causes the current thread to wait until it is signalled or interrupted. The Condition.signalAll() method wakes up all waiting threads.

<b>!</b> Please note that in a real-world situation, you would also need to handle cases where the producer produces data at a faster rate than the consumer can consume it, or vice versa. The solution might involve using multiple producers and consumers, adjusting the size of the buffer, or some other strategy depending on the specific requirements of your application.
