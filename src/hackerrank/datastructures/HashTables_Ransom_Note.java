package hackerrank.datastructures;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Solution for https://www.hackerrank.com/challenges/ctci-ransom-note/problem
 */
public class HashTables_Ransom_Note {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
        }
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();
        }

        boolean status = true;
        HashMap<String, Integer> magazineMap = new HashMap<>();
        HashMap<String, Integer> ransomMap = new HashMap<>();

        for(String word: magazine){
         int count = magazineMap.containsKey(word)? magazineMap.get(word):0;
         magazineMap.put(word, count+1);
        }

        for(String word: ransom){
         int count = ransomMap.containsKey(word)? ransomMap.get(word):0;
         ransomMap.put(word, count+1);
        }

        for(String word : ransomMap.keySet()){
            if(!magazineMap.containsKey(word) || (ransomMap.get(word) > magazineMap.get(word))){
                status = false;
                break;
            }
        }

        if (status){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
        in.close();
    }
}