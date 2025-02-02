package com.example.streaming;
import java.util.function.Predicate;

public class PredicateMain {

    public static void main(String[] args) {
        Predicate<Integer> salaryGreaterThanOneLakh = x -> x > 100000;
        salaryGreaterThanOneLakh.test(30000);
        Predicate<String> startsWithLetterR = x -> x.toLowerCase().charAt(0) == 'r';
        Predicate<String> endsWithLetterI = x -> x.toLowerCase().charAt(x.length() - 1) == 'i';
        Predicate<String> and = startsWithLetterR.and(endsWithLetterI);
        Predicate<String> or = startsWithLetterR.or(endsWithLetterI);
        Predicate<String> negate = and.negate();
        Predicate<String> isEqualPredicate = Predicate.isEqual("ravi");

        System.out.println(and.test("Ravi"));
    }

}
