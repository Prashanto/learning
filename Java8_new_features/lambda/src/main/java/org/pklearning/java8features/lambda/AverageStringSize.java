package org.pklearning.java8features.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

//Write a Java program to implement a lambda expression to find the average length of strings in a list.
public class AverageStringSize {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "apple",
                "banana",
                "CHERRY",
                "Date",
                "elderberry",
                "FIG",
                "grape"
        );

        Function<String,Integer> getLength=String::length;

        double averageLength=words.stream().map(getLength).mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println("List of strings: "+words);
        System.out.println("Average length: "+averageLength);
    }
}
