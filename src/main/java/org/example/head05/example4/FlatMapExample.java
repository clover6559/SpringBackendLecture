package org.example.head05.example4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("Apple", "Banana"),
                Arrays.asList("Cat", "Dog"),
                Arrays.asList("Egg")
        );
        List<String> flattend = nestedList.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());
        System.out.println("Flattend list: " + flattend);
    }
}
