package org.pklearning.java8features.lambda;

import java.util.Arrays;
import java.util.List;

//Write a Java program to implement a lambda expression to check if a list of strings contains a specific word.
public class CheckIfWordInList {

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

        String wordToFind1 = "cherry";     // should be found
        String wordToFind2 = "orange";     // should not be found

        boolean word1Check = words.stream().anyMatch((s)->{return s.equalsIgnoreCase(wordToFind1);});
        boolean word2Check = words.stream().anyMatch((s)->{return s.equalsIgnoreCase(wordToFind2);});

        System.out.println(word1Check?wordToFind1+" is found in the list":wordToFind1+" is not found in the list");
        System.out.println(word2Check?wordToFind2+" is found in the list":wordToFind2+" is not found in the list");

    }
}
