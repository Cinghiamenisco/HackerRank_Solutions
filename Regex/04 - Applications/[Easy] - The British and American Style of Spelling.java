// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        //Leggo N e flusho l'invio
        int lines_to_read = scan.nextInt();
        scan.nextLine();
        
        String s = "";
        for(int i=0; i<lines_to_read; i++) {
            s+= " " + scan.nextLine();
        }
        
        int words_to_match = scan.nextInt();
        scan.nextLine();
        
        for(int i=0; i<words_to_match;i++) {
            
            int tot=0;
            //creo il regex da matchare
            String input = scan.next();
            String to_find = input.substring(0,input.length()-2) + "[sz]{1}e";
                        
            Pattern pattern = Pattern.compile(to_find);
            Matcher matcher = pattern.matcher(s);
            
            while(matcher.find())
                tot++;
            
            System.out.println(tot);
        }        
    }
}
