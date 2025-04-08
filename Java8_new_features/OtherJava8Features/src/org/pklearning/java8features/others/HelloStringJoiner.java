package org.pklearning.java8features.others;

import java.util.StringJoiner;

public class HelloStringJoiner {
    public static void main(String[] args) {
        StringJoiner sj=new StringJoiner(", ","{","}");
        sj.add("one").add("two").add("three");
        System.out.println(sj.toString());
    }
}
