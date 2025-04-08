package org.pklearning.java8features.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

//Write a Java program to implement a lambda expression to create a lambda expression to check if a number is prime.
public class CheckPrime {

    public static void main(String[] args) {
        List<Integer> originalList= Arrays.asList(1,2,23,45,76,1,56,67,2333,67,23,86,93,53);

        Predicate<Integer> primeCheck = (n)->{
            Boolean check=true;
            if(n==1){
                return false;
            }
            for (int i=2;i<=Math.sqrt(n);i++) {
                if(n%i==0){
                    check=false;
                    break;
            }
            }
            return check;
        };

        Consumer<Integer> printPrimeCheck=(n)->{
            if(primeCheck.test(n))
                System.out.println(n.intValue()+" is a prime number");
            else
                System.out.println(n.intValue()+" is not a prime number");
        };

        originalList.stream().distinct().forEach(printPrimeCheck);
    }
}
