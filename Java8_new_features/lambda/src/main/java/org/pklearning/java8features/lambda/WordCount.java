package org.pklearning.java8features.lambda;

import java.util.Arrays;

//Write a Java program to implement a lambda expression to count words in a sentence
public class WordCount {
    public static void main(String[] args) {
        String line="While observing the intricate patterns of the city lights reflecting on the still lake, a gentle breeze carried the scent of jasmine and the distant sound of a street musician playing a melancholic tune, creating a captivating atmosphere that lingered in the air, leaving a lasting impression on the evening's tranquility.";

        long wordCount=Arrays.stream(line.split("\\W")).count();
        System.out.println("Number of words: "+wordCount);
    }
}
