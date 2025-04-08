package org.pklearning.java8features.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//Write a Java program to implement a lambda expression to calculate the sum of all prime numbers in a given range.
public class SumOfAllPrimeNumbers {

    public static void main(String[] args) {
        List<Integer> originalList= Arrays.asList(1,2,23,45,76,1,56,67,2333,67,23,86,93,53);

        Predicate<Integer> primeCheck = (n)->{
            boolean check=true;
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

        System.out.println("Original List:"+originalList);
        System.out.print("List of prime numbers:");
        List<Integer> primeList=new ArrayList<Integer>();
        originalList.stream().filter(primeCheck).forEach(primeList::add);
        System.out.println(primeList);
        int sumOfPrime=primeList.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of the prime numbers: "+sumOfPrime);
    }
}
