// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco

import java.io.*;
import java.util.*;
import java.util.regex.*;

enum Version {
    IPV4, IPV6;
}

public class Solution {

    public static boolean is_IP(String strTest, Version version) {
        String regex = "";

        if (version == Version.IPV4)
            regex = "^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        if (version == Version.IPV6)
            regex = "^(?:[A-F0-9]{1,4}:){7}[A-F0-9]{1,4}$";


        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(strTest);
        return matcher.matches();
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();

        while (n>0) {

            String toTest = scan.nextLine();
            if (is_IP(toTest, Version.IPV4)) {
                System.out.println("IPv4");
            } else if (is_IP(toTest, Version.IPV6)) {
                System.out.println("IPv6");
            } else {
                System.out.println("Neither");
            }

            n--;
        }

    }
}
