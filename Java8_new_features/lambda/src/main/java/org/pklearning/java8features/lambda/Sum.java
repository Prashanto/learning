import java.util.function.Function;
import java.util.function.IntBinaryOperator;

//Write a Java program to implement a lambda expression to find the sum of two integers.

public class Sum {
    public static void main(String[] args) {

        int a=5;
        int b=10;
        IntBinaryOperator sumCalc=(x,y)-> x+y;
        System.out.println("Sum: "+sumCalc.applyAsInt(a,b));


    }
}