package org.pklearning.java8features.lambda;

import java.util.function.Predicate;

//Write a Java program to implement a lambda expression to check if a given string is empty
public class CheckEmptyString {
    public static void main(String[] args) {
        Predicate<String> nullcheck=(String s)-> {if(s==null) return Boolean.TRUE; else return s.isEmpty();};
        String checkString="Hello world";
        System.out.println("checkString String Empty: "+nullcheck.test(checkString));

        checkString="";
        System.out.println("checkString2 String Empty: "+nullcheck.test(checkString));

        checkString=null;
        System.out.println("checkString3 String Empty: "+nullcheck.test(checkString));
    }
}
