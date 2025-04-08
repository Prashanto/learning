package org.pklearning.java8features.lambda;

//Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

//Write a Java program to implement a lambda expression to filter out even and odd numbers from a list of integers.
public class StringListToChangeCase {
    public static void main(String[] args) {
        List<String> lowerCaseList= Arrays.asList("red","blue","Green");
        List<String> upperCaseList= Arrays.asList("RED","BLUE","GrEEn");

        Function<String,String> toLower = String::toLowerCase;
        Function<String,String> toUpper = String::toUpperCase;
        Consumer<String> tabbedPrint=(String s) -> { System.out.println("\t"+s); };

        System.out.println("Lower case list:");
        lowerCaseList.stream().map(toLower).forEach(tabbedPrint);
        System.out.println("Upper case list:");
        upperCaseList.stream().map(toUpper).forEach(tabbedPrint);
    }
}
