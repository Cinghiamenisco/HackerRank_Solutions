-- Autore:      Christian Luzzetti
-- Mail:        Christian.luzzetti@gmail.com
-- HackerRank:  https://www.hackerrank.com/Cinghiamenisco

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {

        int positives = 0;
        int negatives = 0;
        int ohs = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] > 0) {
                positives++;
            } else if (arr[i] == 0) {
                ohs++;
            } else if (arr[i] < 0) {
                negatives++;
            }
        }
        
        double positive_ratio = (double)positives / arr.length;
        double ohs_ratio = (double)ohs/arr.length;
        double negative_ratio = (double)negatives/arr.length;
        
        System.out.printf("%.6f\n",positive_ratio);
        System.out.printf("%.6f\n",negative_ratio);
        System.out.printf("%.6f\n",ohs_ratio);
    }
    
    // Codice Preesistente

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
