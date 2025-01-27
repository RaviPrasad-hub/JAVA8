package com.example.streaming;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Integer> numbers = Arrays.asList(21,34,23,56,76);

        int result = numbers.stream()
            .filter(n -> n%2 ==1)
            .sorted()
            .map(n -> n*2)
            .reduce(0, (c,e) -> c+e);

            System.out.println("Print -> " + result);
    }
}