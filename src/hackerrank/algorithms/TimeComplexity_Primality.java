package hackerrank.algorithms;

import java.util.Scanner;

/**
 * Solution for https://www.hackerrank.com/challenges/ctci-big-o/problem
 */
public class TimeComplexity_Primality {

    public static String isPrime(int n) {
        if (n < 2 || (n>2 && n % 2 == 0)) {
            return "Not prime";
        } else if (n == 2) {
            return "Prime";
        }
        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrt; i ++) {
            if (n % i == 0) {
                return "Not prime";
            }
        }
        return "Prime";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        for(int a0 = 0; a0 < p; a0++){
            int n = in.nextInt();
            System.out.println(isPrime(n));
        }

        in.close();
    }
}