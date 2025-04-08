package org.pklearning.java8features.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Write a Java program to implement a lambda expression to sort a list of strings in alphabetical order.
public class SortStringList {

    public static void main(String[] args) {
        List<String> listOfString= Arrays.asList("Red","Blue","Green","Abacus","Hello","Park");

        Comparator<String> ascendingOrder=(a,b) -> a.compareTo(b);

        listOfString.stream().sorted(ascendingOrder).forEach(System.out::println);
    }
}
