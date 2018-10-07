// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static boolean is_valid_username(String usr) {

        String regex = "^[_.][0-9]+[a-zA-Z]*[_]?$";

        Pattern p = Pattern.compile(regex);

        Matcher matcher = p.matcher(usr);

        return matcher.matches();
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();

        while (n>0) {
            System.out.println((is_valid_username(scan.nextLine())) ? "VALID" : "INVALID");
            n--;
        }
    }
}
