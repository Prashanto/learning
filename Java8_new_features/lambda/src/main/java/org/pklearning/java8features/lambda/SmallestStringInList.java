package org.pklearning.java8features.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

//Write a Java program to implement a lambda expression to find the length of the longest and smallest string in a list.
public class SmallestStringInList {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "apple",
                "banana",
                "cherry",
                "date",
                "elderberry",
                "fig",
                "grape"
        );
        List<String> words2=Arrays.asList();
        BinaryOperator<String> smallestOfTwo=(s1,s2) -> {
            if(s1==null) return s1;
            else if (s2==null) return s2;
            else return s1.length()<s2.length()?s1:s2;
        };

        BinaryOperator<String> largestOfTwo=(s1,s2) -> {
            if(s1==null) return s2;
            else if (s2==null) return s1;
            else return s1.length()>s2.length()?s1:s2;
        };

        String smallestString=words.stream().reduce(smallestOfTwo).orElse("EmptyList").toString();
        String largestString=words.stream().reduce(largestOfTwo).orElse("EmptyList").toString();
        System.out.println("Smallest text: "+smallestString);
        System.out.println("Longest text: "+largestString);
    }
}
