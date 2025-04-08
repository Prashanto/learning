package org.pklearning.java8features.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilterOddAndEven {
    public static void main(String[] args) {
        List<Integer> numberList= Arrays.asList(1,2,3,46,723,13,57,14,6,78,9,889);

        Predicate<Integer> checkOdd= (Integer n)->{return n.intValue()%2==0?Boolean.FALSE:Boolean.TRUE;};
        Predicate<Integer> checkEven= (Integer n)->{return n.intValue()%2==0?Boolean.TRUE:Boolean.FALSE;};
        Consumer<Integer> tabbedPrint=(Integer s) -> { System.out.println("\t"+s.toString()); };
        System.out.println("List of Odd numbers");
        numberList.stream().filter(checkOdd).forEach(tabbedPrint);
        System.out.println("List of Even numbers");
        numberList.stream().filter(checkEven).forEach(tabbedPrint);
    }

}
