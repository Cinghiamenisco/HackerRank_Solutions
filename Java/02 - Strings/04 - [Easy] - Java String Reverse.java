// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        int i = 0;
        int k = A.length()-1;
        
        while (i<=k) {
            if (A.charAt(i) != A.charAt(k)) {
                System.out.println("No");
                return;
            }
            
            i++;
            k--;
            
        }
        System.out.println("Yes");
        return;
    }
}



