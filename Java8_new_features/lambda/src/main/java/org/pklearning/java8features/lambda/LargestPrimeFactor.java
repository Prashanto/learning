package org.pklearning.java8features.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

//Write a Java program to implement a lambda expression to find the largest prime factor of a given number.
public class LargestPrimeFactor {
    public static void main(String[] args) {
        List<Integer> originalList= Arrays.asList(1,2,23,45,76,1,56,67,2333,67,23,86,93,53);

        Predicate<Integer> checkPrime=(n)->{
            if(n==1) return false;
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0)
                    return false;
            }
            return true;
        };

        Consumer<Integer> highestPrime=(n)->{
            int hcf=1;
            if(n==1){
                System.out.println("HCF of "+n+" = "+n);
            }
            else{
                for(int i=2;i<=n;i++)
                {
                    if(n%i==0 && checkPrime.test(i)){
                        hcf=i;
                    }
                }
            }
            System.out.println("HCF of "+n+" = "+hcf);
        };

        originalList.forEach(highestPrime);
    }
}
