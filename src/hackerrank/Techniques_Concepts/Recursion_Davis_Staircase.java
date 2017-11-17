package hackerrank.Techniques_Concepts;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Solution to https://www.hackerrank.com/challenges/ctci-recursive-staircase/problem
 */
public class Recursion_Davis_Staircase {

    private static HashMap<Integer, Integer> steps = new HashMap<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        for(int a0 = 0; a0 < s; a0++){
            int n = in.nextInt();
            System.out.println(climb(n));
        }

        in.close();
    }

    private static int climb(int n) {
        if(n < 0)
            return 0;

        if(n == 0)
            return 1;

        if(!steps.containsKey(n)) {
            int count = climb(n-1) + climb(n-2) + climb(n-3);
            steps.put(n, count);
        }
        return steps.get(n);
    }

}