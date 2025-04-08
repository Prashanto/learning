package org.pklearning.java8features.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//Write a Java program to implement a lambda expression to convert an integer to their corresponding binary representation.
public class IntegerToBinary {
    public static void main(String[] args) {

        List<Integer> originalList= Arrays.asList(1,2,23,45,76,1,56,67,2333,67,23,86,93,53);

        Consumer<Integer> convertToBinary=(n)-> {
            System.out.println(n+" : "+Integer.toBinaryString(n));
        };

        originalList.forEach(convertToBinary);
    }

}
