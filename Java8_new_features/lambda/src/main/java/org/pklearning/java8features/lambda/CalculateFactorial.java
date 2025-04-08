package org.pklearning.java8features.lambda;

import java.util.function.LongUnaryOperator;

//Write a lambda expression to implement a lambda expression to calculate the factorial of a given number.
public class CalculateFactorial {
    public static void main(String[] args) {
        int num=10;

        LongUnaryOperator factorial = n ->{
            long val=1;
            for(int i=1;i<=n;i++) val=val*i;
            return val;
        };

        System.out.println("Factorial of "+num+" = "+factorial.applyAsLong(num));

    }
}
