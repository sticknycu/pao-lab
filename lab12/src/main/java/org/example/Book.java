package org.example;

import java.util.function.Function;

public class Book implements Borrowable<Book> {
    @Override
    public String toString(Function<? super Book, String> format) {
        return format.apply(this);
    }
}
