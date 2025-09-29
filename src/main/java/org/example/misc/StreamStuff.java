package org.example.misc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamStuff {
    public static void doStuff() {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);

        final double sum = numbers.stream().mapToInt(x -> x).sum();
        final double average = numbers.stream().mapToInt(x -> x).average().getAsDouble();
        final List<Double> numbersOverSums = numbers.stream().map(
                (x ->(1.0/x) /numbers.stream().mapToInt(y -> y).sum())
        ).toList();

    }
}
