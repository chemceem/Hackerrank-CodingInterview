package hackerrank.datastructures;

import java.util.Scanner;

/**
 * Solution for the challenge https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem
 */
public class Arrays_Left_Rotation
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }

        int newArray[] = new int[n];
        for(int j=0; j<n ; j++){
            newArray[j] = a[(d+j)%n];
        }

        for(int i=0; i<n; i++) {
            System.out.print(newArray[i]+" ");
        }
    }
}