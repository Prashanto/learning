package org.pklearning.java8features.lambda;

import java.util.Arrays;
import java.util.List;

//Write a Java program to implement a lambda expression to find the maximum and minimum values in a list of integers.
public class MaxAndMinCalculator {
    public static void main(String[] args) {
        List<Integer> numberList= Arrays.asList(1,2,3,46,723,13,57,14,6,78,9,889);
//        List<Integer> numberList= Arrays.asList();
        System.out.println("Original List: "+numberList);
        System.out.println("Maximum of the above list : "+numberList.stream().mapToInt(Integer::intValue).max().orElse(0));
        System.out.println("Minimum of the above list : "+numberList.stream().mapToInt(Integer::intValue).min().orElse(0));
    }
}
