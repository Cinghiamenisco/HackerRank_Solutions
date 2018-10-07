// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static int countSubstrings(String substring, String[] strings) {
        int count = 0;

        //
        String regex = "(?<=\\w)" + substring + "(?=\\w)";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        int i=strings.length-1;
        while (i>=0) {
            Matcher m = p.matcher(strings[i]);

            while (m.find()) {
                count++;
            }

            i--;
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        String[] strings = new String[n];
        int i=0;
        while (n>0) {
            strings[i] = scan.nextLine();
            n--;
            i++;
        }
        int m = scan.nextInt();
        scan.nextLine();
        while (m>0) {
            //Test Substring
            System.out.println(countSubstrings(scan.nextLine(), strings));
            m--;
        }
    }
}
