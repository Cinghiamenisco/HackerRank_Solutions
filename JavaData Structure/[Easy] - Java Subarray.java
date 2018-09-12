// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }
        
        int tot_neg = 0;
        for(int i=0; i<arr.length; i++) {
            for (int j=i; j<arr.length; j++) {
                int sum = 0;
                int[] subarray = Arrays.copyOfRange(arr, i, j+1);
                for(int k=0; k<subarray.length; k++) {
                    sum+=subarray[k];
                }   
                if (sum < 0) tot_neg++;
            }
        }
        System.out.println(tot_neg);
    }
}
