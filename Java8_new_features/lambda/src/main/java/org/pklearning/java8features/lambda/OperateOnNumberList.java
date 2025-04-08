package org.pklearning.java8features.lambda;

import java.util.Arrays;
import java.util.List;

//Write a Java program to create a lambda expression to multiply and sum all elements in a list of integers.
public class OperateOnNumberList {
    public static void main(String[] args) {
        List<Integer> numberList= Arrays.asList(1,2,3,46,723,13,57,14,6,78,9,889,0);
//        List<Integer> numberList= Arrays.asList();
        System.out.println("Original List: "+numberList);
        System.out.println("Sum of the above list : "+numberList.stream().mapToInt(Integer::intValue).sum());
        System.out.println("Multiplication product of the above list : "+numberList.stream().mapToInt(Integer::intValue).reduce((a,b)->{return a*b;}).orElse(1));
    }
}
