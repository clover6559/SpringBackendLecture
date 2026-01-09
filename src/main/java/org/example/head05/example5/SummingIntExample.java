package org.example.head05.example5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SummingIntExample {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(5,12,18,7);
        List<Double> doubles = Arrays.asList(1.3, 2.0, 3.4, 4.2, 5.0);
        List<Long> logs = Arrays.asList(1L, 2L, 3L, 4L, 5L);

        int intSum = ints.stream()
                .collect(Collectors.summingInt(Integer::intValue));
        Double doubleSum = doubles.stream()
                .collect(Collectors.summingDouble(Double::doubleValue));
        Long longSum = logs.stream()
                .collect(Collectors.summingLong(Long::longValue));
        System.out.println("int Sum = " + intSum);
        System.out.println("double Sum = " + doubleSum);
        System.out.println("long Sum = " + longSum);

    }
}
