package org.pklearning.java8features.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

//Write a Java program to implement a lambda expression to check if a list of strings are all uppercase or all lowercase or mixedcase.
public class StringCaseCheck {
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

        Function<String,String> caseCheck=(s)->{
            if(s.isEmpty()) return "NA";
            else if (s.toLowerCase().equals(s)) return "lower case";
            else if (s.toUpperCase().equals(s)) return "upper case";
            else return "mixed";
        };

        words.forEach((s)->{
            System.out.println(s+"\t\t\t:\t\t"+caseCheck.apply(s));
        });
    }
}
