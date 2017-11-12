package hackerrank.Techniques_Concepts;

import java.util.Scanner;

/**
 * Solution for https://www.hackerrank.com/challenges/ctci-fibonacci-numbers/problem
 */
public class Recursion_Fibonacci_Numbers {

    public static int fibonacci(int n){
        if(n==0){
            return 0;
        } else if(n == 1){
            return 1;
        } else
            return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
}