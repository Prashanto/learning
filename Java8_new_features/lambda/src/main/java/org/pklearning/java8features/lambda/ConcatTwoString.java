package org.pklearning.java8features.lambda;

import java.util.StringJoiner;
import java.util.function.BinaryOperator;

//Write a Java program to implement a lambda expression to concatenate two strings.
public class ConcatTwoString {
    public static void main(String[] args) {
        BinaryOperator<String> concatString=(s1,s2)->{StringJoiner sJoin=new StringJoiner(" "); sJoin.add(s1);sJoin.add(s2); return sJoin.toString();
        };

        String a="Hello",b="World";

        System.out.println(concatString.apply(a,b));
    }
}
