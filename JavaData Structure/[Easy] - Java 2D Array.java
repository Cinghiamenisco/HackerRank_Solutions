// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        
        int max = Integer.MIN_VALUE;
        for (int rows = 0; rows < 6-2; rows++) {
            for ( int cols = 0; cols < 6-2; cols++) {                
                int sum = arr[rows+0][cols+0] 
                    + arr[rows+0][cols+1] 
                    + arr[rows+0][cols+2] 
                    + arr[rows+1][cols+1] 
                    + arr[rows+2][cols+0] 
                    + arr[rows+2][cols+1] 
                    + arr[rows+2][cols+2];
                max = (sum > max) ? sum : max ;
            }
        }
        
        System.out.println(max);
        
        /* Hourglass
        arr[0][0] + arr[0][1] + [0][2] + [1][1] + [2][0] + [2][1] + [2][2]
        */
        

        scanner.close();
    }
}
