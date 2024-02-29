package RECURSION; 

import java.util.Scanner;

public class Fibonacci_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = scanner.nextInt();
        System.out.println("Fibonacci number at position " + n + ": " + fib(n));
    }

    public static int fib(int n) {
        if (n < 2)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
}
