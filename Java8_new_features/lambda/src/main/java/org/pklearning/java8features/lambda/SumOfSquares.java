package org.pklearning.java8features.lambda;

import java.util.Arrays;
import java.util.List;

//Write a Java program to implement a lambda expression to calculate the sum of squares of all odd and even numbers in a list.
public class SumOfSquares {
    public static void main(String[] args) {
        List<Integer> numberList= Arrays.asList(1,2,3,46,723,13,57,14,6,78,9,889);
//        List<Integer> numberList= Arrays.asList();
        System.out.println("Original List: "+numberList);
        System.out.println("Sum of square of even numbers : "+numberList.stream().mapToInt(Integer::intValue).filter((n)->{return n%2==0?true:false;}).map((a)->{return a*a;}).sum());
        System.out.println("Sum of square of odd numbers : "+numberList.stream().mapToInt(Integer::intValue).filter((n)->{return n%2==0?false:true;}).map((a)->{return a*a;}).sum());
    }
}
