// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * 07:05:45PM
         */
        
        String ora = s.substring(0,2);
        String minute = s.substring(3,5);
        String seconds = s.substring(6,8);
        String ampm = s.substring(s.length()-2);
    
        if (ampm.equalsIgnoreCase("AM") && ora.equals("12")) {
            ora = "00";
        }
        
        if (ampm.equalsIgnoreCase("PM") && !ora.equals("12")) {
            Integer tmp_ora = Integer.parseInt(ora) + 12;
            ora = tmp_ora.toString();
        }
        
                return ora + ":" + minute + ":" + seconds;
        
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
