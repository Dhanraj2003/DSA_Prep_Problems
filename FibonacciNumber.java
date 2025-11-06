package Java_Array_Practical_Problems;

import java.util.ArrayList;
import java.util.List;


public class FibonacciNumber {

    public static void fibonacciSeriesUpToN(int range) {
        int a = 0, b = 1;

        System.out.print(a + " " + b + " ");

        int c = a + b;
        while (c <= range) {
            System.out.print(c + " ");
            a = b;
            b = c;
            c = a + b;
        }
    }

    public static void main(String[] args) {
        fibonacciSeriesUpToN(100); // prints Fibonacci numbers up to 100
    }
}

