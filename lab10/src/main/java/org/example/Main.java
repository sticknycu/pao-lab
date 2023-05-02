package org.example;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Main {
    public static void main(String[] args) {


        // Deleting inside loop mistake!
        // Concurrent Modification Exception!
        List<String> words = new ArrayList<>(
                Arrays.asList("a", "b", "c", "d")
        );

        /*words.forEach(word -> {
            if (word.equals("a")) {
                words.remove(word);
            }
        });*/


        // Use Iterator for remove, not arraylist!
        Iterator<String> iterator = words.iterator();

        while (iterator.hasNext()) {
            String word = iterator.next();
            if (word.equals("a")) {
                iterator.remove();
            }
        }
        // OR: (iterator implementation)
        words.removeIf(element -> element.equals("a"));

        // List Iterator for reverse order!
        ListIterator<String> stringListIterator = words.listIterator();
        while (stringListIterator.hasPrevious()) {
            String word = stringListIterator.previous();
            if (word.equals("a")) {
                words.remove(word);
            }
        }

        // The Iterator interface does not allow you to modify the collection during iteration.
        // If you need to modify the collection, you can use the ListIterator interface instead.
        ListIterator<String> stringListIterator2 = words.listIterator();
        while (stringListIterator2.hasNext()) {
            String word = stringListIterator2.next();
            if (word.equals("b")) {
                stringListIterator2.remove();
                stringListIterator2.add("t");
            }
        }
        // OR:
        ListIterator<String> stringListIterator3 = words.listIterator();
        while (stringListIterator3.hasNext()) {
            String word = stringListIterator3.next();
            if (word.equals("c")) {
                stringListIterator3.set("r");
            }
        }

        // Print
        words.forEach(System.out::println);



        // Spliterator
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Dave");
        names.add("Eve");

        Spliterator<String> spliterator = names.spliterator();

        Spliterator<String> trySplitIterator = spliterator.trySplit();

        long size = trySplitIterator.estimateSize();
        System.out.println("first split size: " + size);
        trySplitIterator.forEachRemaining(System.out::println);
        System.out.println("==============================");

        long exactRemaining = spliterator.getExactSizeIfKnown();
        System.out.println("Remaining: " + exactRemaining);
        System.out.println("==============================");

        Spliterator<String> newSplit = spliterator.trySplit();
        long secondSplitSize = newSplit.estimateSize();
        System.out.println("second split size: " + secondSplitSize);
        newSplit.forEachRemaining(System.out::println);

        System.out.println("==============================");
        long newSplitSize = spliterator.getExactSizeIfKnown();
        System.out.println("Remaining: " + newSplitSize);
        spliterator.forEachRemaining(System.out::println);

        System.out.println("=============TryAdvance Example=========");

        List<String> names2 = new ArrayList<>();
        names2.add("Robert");
        names2.add("Andrei");
        names2.add("Stefan");

        Spliterator<String> names2Spliterator = names2.spliterator();

        Spliterator<String> firstSplit = names2Spliterator.trySplit();
        long sizeFirstSplit = firstSplit.getExactSizeIfKnown();
        System.out.println("Exact size first split: " + sizeFirstSplit);
        firstSplit.forEachRemaining(System.out::println);

        System.out.println("Other names:");

        names2Spliterator.tryAdvance(System.out::println);
        names2Spliterator.tryAdvance(System.out::println);
        names2Spliterator.tryAdvance(System.out::println);
        names2Spliterator.tryAdvance(System.out::println);


        System.out.println("=============Infinite Stream Example=========");

        Spliterator<Integer> infiniteSpliterator = new Spliterators.AbstractSpliterator<>(Long.MAX_VALUE, Spliterator.ORDERED) {
            private int value = 0;

            @Override
            public boolean tryAdvance(Consumer<? super Integer> action) {
                action.accept(value++);
                return true;
            }
        };

        Stream<Integer> infiniteStream = StreamSupport.stream(infiniteSpliterator, false);

        // only one stream, you can't operate 2 streams.
        //infiniteStream.limit(10).forEach(System.out::println);

        // OR USING tryAdvance:

        Spliterator<Integer> integerSpliterator = infiniteStream.spliterator();

        integerSpliterator.tryAdvance(System.out::println);
    }
}