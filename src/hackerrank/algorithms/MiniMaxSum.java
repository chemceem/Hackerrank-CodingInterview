package hackerrank.algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MiniMaxSum {

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        long[] arr = new long[5];

        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextLong();
        }

        List<Long> numbers = Arrays.stream(arr).boxed().collect(Collectors.toList());
        long max = numbers.stream().mapToLong(n -> n).max().getAsLong();
        long min = numbers.stream().mapToLong(n -> n).min().getAsLong();
        long sum = numbers.stream().mapToLong(n -> n).sum();

        System.out.print((sum-max)+" "+(sum-min));
    }
}