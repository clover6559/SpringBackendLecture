package org.example.head05.example4;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class MapEntryTransformationExample {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Kim", 90);
        scores.put("Lee", 85);
        scores.put("Park", 92);

        Function<Map.Entry<String, Integer>, String> entryToString = new Function<Map.Entry<String, Integer>, String>() {
            @Override
            public String apply(Map.Entry<String, Integer> entry) {
                return entry.getKey() + ": " + entry.getValue();
            }
        };
        scores.entrySet().stream()
                .map(entryToString)
                .forEach(result -> System.out.println("Student Info: " + result ));


    }
}
