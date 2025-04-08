package org.pklearning.java8features.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//Write a Java program to implement a lambda expression to check if a given number is a perfect square.
public class CheckPerfectSquare {
    public static void main(String[] args) {
        List<Integer> originalList= Arrays.asList(1,2,9,64,23,45,76,1,56,67,2333,67,23,86,93,53);

        Predicate<Integer> checkPerfectSquare = (n) -> {
            float l= (float) Math.sqrt(n);
            return (Math.ceil(l) == l);
        };

        List<Integer> perfectSqList=new ArrayList<>();

        originalList.stream().filter(checkPerfectSquare).distinct().forEach(perfectSqList::add);

        System.out.println("Original List: "+originalList);
        System.out.println("List of perfect squares: "+perfectSqList);

    }
}
