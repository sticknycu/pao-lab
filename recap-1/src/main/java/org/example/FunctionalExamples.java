package org.example;

import java.util.function.*;

public class FunctionalExamples {


    Predicate<Integer> estePar = (number) -> number % 2 == 0;
    Predicate<Integer> esteImpar = (number) -> number % 2 != 0;

    BiPredicate<Integer, Double> biPredicate = (number1, number2) -> number2 % number1 == 0;

    Consumer<Integer> consumerExample = (passedVariable) -> System.out.println(passedVariable);

    BiConsumer<Integer, Double> biConsumer = (var1, var2) -> System.out.println("var1: " + var1 + " var2" + var2);

    Function<Integer, Double> calculateFunction = (x) -> Math.pow(x, 2) + 5 * x + 3;

    BiFunction<Integer, Integer, Double> calculateBiFunction = (x, y) -> Math.pow(x, 2) * Math.pow(y, 2) + 5 * x * y + 3;

    UnaryOperator<Integer> calculateUnary = (x) -> (int) (Math.pow(x, 2) + 5 * x + 3);

    Supplier<Double> MATH_CUSTOM_PI = () -> Math.PI;

    public static void main(String[] args) {

    }
}
