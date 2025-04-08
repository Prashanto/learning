package org.pklearning.java8features.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

//Write a Java program to implement a lambda expression to find the second largest and smallest element in an array.
public class SecondLargestAndSmallest {
    public static void main(String[] args) {
        List<Integer> originalList= Arrays.asList(1,23,45,76,1,56,67,2333,67,23,2,9,64,86,93,53,233);

        int secondSmallest = originalList.stream().distinct().sorted().skip(1).findFirst().orElse(-999);
        int secondLargest= originalList.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(-999);


        System.out.println("Original List: "+originalList);

        System.out.println("Second smallest:"+secondSmallest);
        System.out.println("Second largest:"+secondLargest);

    }
}
