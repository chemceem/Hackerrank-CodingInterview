package hackerrank.datastructures;

import java.util.*;

/**
 * Solution for https://www.hackerrank.com/challenges/ctci-making-anagrams/problem
 */
public class Strings_MakingAnagrams {

    public static int numberNeeded(String first, String second) {

        char[] firstCharArray = first.toCharArray();

        for(int i=0; i<firstCharArray.length;i++){
            char c = firstCharArray[i];
            if(second.indexOf(c) != -1){
                first = first.replaceFirst(c+"","");
                second = second.replaceFirst(c+"","");
            }
        }
        return first.length()+second.length();
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}