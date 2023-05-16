package org.example;

import java.util.function.Function;

public interface Borrowable<T> {
    String toString(Function<? super T, String> format);
}
