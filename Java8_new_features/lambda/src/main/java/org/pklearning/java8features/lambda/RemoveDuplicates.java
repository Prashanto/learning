package org.pklearning.java8features.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Write a Java program to implement a lambda expression to remove duplicates from a list of integers.
public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> originalList= Arrays.asList(1,23,45,76,1,56,67,2333,67,23,86,93,53);

        System.out.println("Original List : "+originalList);

        List<Integer> uniqueList= new ArrayList<Integer>();
        originalList.stream().mapToInt(Integer::intValue).distinct().forEach((a)->uniqueList.add(a));

        System.out.println("Unique List : "+uniqueList);
    }
}
