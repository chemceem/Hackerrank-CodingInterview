package hackerrank.algorithms;

import java.util.Scanner;

/**
 * Solution for https://www.hackerrank.com/challenges/plus-minus/problem
 */
public class PlusMinus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int pos=0, neg=0, zero=0;
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if(arr[arr_i] >0 ){
                pos++;
            } else if(arr[arr_i]< 0){
                neg++;
            } else {
                zero++;
            }
        }

        System.out.println((float) pos/n);
        System.out.println((float)neg/n);
        System.out.println((float)zero/n);
        in.close();
    }
}