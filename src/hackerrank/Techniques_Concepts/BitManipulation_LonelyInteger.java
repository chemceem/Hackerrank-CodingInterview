package hackerrank.Techniques_Concepts;

import java.util.Scanner;

/**
 * Solution for https://www.hackerrank.com/challenges/ctci-lonely-integer/problem
 */
public class BitManipulation_LonelyInteger {

    public static int lonelyInteger(int[] num){
        int a =0;
        for (int i: num){
            a = a^i;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        System.out.print(lonelyInteger(a));
        in.close();
    }
}