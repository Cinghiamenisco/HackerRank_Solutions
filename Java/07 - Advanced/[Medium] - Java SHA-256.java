// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco

import java.io.*;
import java.util.*;
import java.security.*;

public class Solution {

    public static void main(String[] args) {

         Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
        StringBuffer sb = new StringBuffer();

        
         try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");  
            md.update(s.getBytes());
            byte[] digest = md.digest();

            for (byte b : digest) {
                sb.append(String.format("%02x", b & 0xff));
            }
             
         } catch (Exception e) {
             System.out.println(e);
         }
        
        System.out.println(sb.toString());
        
    }
}
