import java.util.Optional;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

abstract class Class1 {

    abstract void f1();
}

class Class2 {

    Predicate<String> predicate = (s) -> s.isEmpty();

    Predicate<String> stringPredicate = String::isEmpty;

    UnaryOperator<Integer> integerUnaryOperator = (i) -> i + 1;

    Function<Integer, Integer> integerIntegerFunction = (i) -> i + 1;

    BiFunction<String, String, String> stringStringFunction = (a, b) -> a + b;

    Consumer<String> consumer = (s) -> {
        System.out.println(s);
    };

    Optional<Object> obj = Optional.ofNullable(null);
}