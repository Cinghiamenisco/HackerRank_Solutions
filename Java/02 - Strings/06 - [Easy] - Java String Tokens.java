// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
        //trim the string
        s = s.trim();
            
        if (s.length() == 0) {
            System.out.println("0");
            return;
        }
        
        //String[] results = s.split("[\\W]+");
        String[] results = s.split("[\\p{Punct}\\s]+");
        System.out.println(results.length);
        for (int i=0; i<results.length; i++) {
            System.out.println(results[i]);
        }
        
        scan.close();
    }
}


