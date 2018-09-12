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
        ArrayList<ArrayList<Integer>> riga = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<n; i++) {
            int s = scan.nextInt();
            ArrayList<Integer> col = new ArrayList<Integer>();
            for(int k=0; k<s; k++) {
                col.add((scan.nextInt()));
            }
            riga.add(col);
        }
        
        
        n = scan.nextInt();
        for(int k=0; k<n; k++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            try {
                System.out.println(riga.get(a-1).get(b-1));
            } catch (IndexOutOfBoundsException iob) {
                System.out.println("ERROR!");
            }
         }        
    }
}
