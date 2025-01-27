package com.example.streaming;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Java8STreams {

    public static void main(String[] args) {
        int[] arrayNums = {3,6,23,45,12,43};
        int sum = Arrays.stream(arrayNums).filter(n -> n%2==0).reduce(0, (c,d) -> c+d);
        System.out.println(sum);

    //way to create stream

    List<String> fruits = Arrays.asList("apple","banana","cherry");
    fruits.stream().sorted().forEach(fruit -> System.out.println(fruit));

    String[] bikes = {"fzx" , "ri5" , "bullet"};
    Arrays.stream(bikes).sorted().filter(bike->bike.startsWith("r")).forEach(bike->System.out.println(bike));

    Stream<Integer> integerStream = Stream.of(3,5,4,6,8,4);
    integerStream.forEach(n->System.out.println(n));

    Stream.iterate(0,n->n+1).limit(10).forEach(n-> System.out.println(n));
    
    Stream.generate(()->(int) (Math.random() * 5)).limit(5).forEach(n->System.out.println(n));


    } 
}
