package org.pklearning.java8features.lambda;

import java.util.Arrays;
import java.util.List;

//Write a Java program to implement a lambda expression to find the average of a list of doubles.
public class FindAverage {
    public static void main(String[] args) {
        List<Double> numberList= Arrays.asList(1.2,123.0,45.0,12.001,2.0,0.01);

        System.out.println("Original List: ");
        System.out.println(numberList);

        double avg=numberList.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);

        System.out.println("Average value: "+avg);


    }
}
