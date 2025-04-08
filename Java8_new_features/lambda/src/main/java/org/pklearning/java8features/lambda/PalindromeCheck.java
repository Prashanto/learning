package org.pklearning.java8features.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

//Write a Java program to implement a lambda expression to check if a given string is a palindrome.
public class PalindromeCheck {
    public static void main(String[] args) {

        List<String> testWords = Arrays.asList(
                "racecar",     // palindrome
                "level",       // palindrome
                "hello",       // not a palindrome
                "madam",       // palindrome
                "world",       // not a palindrome
                "rotor",       // palindrome
                "java",        // not a palindrome
                "noon",        // palindrome
                "palindrome",  // not a palindrome
                "civic"        // palindrome
        );

        Predicate<String> palindromeCheck=(s) ->{
            StringBuilder sb=new StringBuilder();
            sb.append(s).trimToSize();
            sb.reverse();
            String rev=sb.toString();
            return s.equalsIgnoreCase(rev);
        };

        Consumer<String> checkPalindrome=(s)->{
            if(palindromeCheck.test(s))
                System.out.println(s+" is a Palindrome");
            else System.out.println(s+" is not a Palindrome");
        };

        testWords.stream().forEach(checkPalindrome);
    }
}
