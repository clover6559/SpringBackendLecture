package org.example.head05.example5;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class SummarizingExample {
    public static void main(String[] args) {
        List<Integer> intScores = Arrays.asList(80, 70, 95, 100, 85);
        IntSummaryStatistics intSummaryStatistics = intScores.stream()
                .collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println("Int Summary Count = " + intSummaryStatistics.getCount());
        System.out.println("Int Summary Sum = " + intSummaryStatistics.getSum());
        System.out.println("Int Summary Min = " + intSummaryStatistics.getMin());
        System.out.println("Int Summary Max = " +intSummaryStatistics.getMax());
        System.out.println("Int Summary Average = " + intSummaryStatistics.getAverage());
    }
}
