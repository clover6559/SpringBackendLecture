package org.example.head05.example4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaPractice {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
    names.forEach(System.out::println);
        Consumer<String> print = s -> System.out.println(s);
        names.forEach(print);

        Predicate<String> lengthCheck = s -> s.length() >= 5;
        names.stream().filter(lengthCheck).forEach(System.out::println);

        Function<String, String> toUpper = s -> s.toUpperCase();
        names.stream().map(toUpper).forEach(System.out::println);
    }
}
