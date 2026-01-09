package org.example.head05.example5;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningExample {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5,12,18,7,3,21);
        Map<Boolean, List<Integer>> partionioned = nums.stream()
                .collect(Collectors.partitioningBy(n -> n >= 10));
                        System.out.println(partionioned);

    }
}
