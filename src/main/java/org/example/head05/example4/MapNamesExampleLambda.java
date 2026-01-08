package org.example.head05.example4;

import java.util.Arrays;
import java.util.List;

public class MapNamesExampleLambda {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Chalice");
        names.stream()
                .map(s -> s.length())
                .forEach(length -> System.out.println("Name length: " + length));
    }
}
