// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco

import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        // Write your code here.
              
        // Note: India does not have a built-in Locale, so you must construct one where the language is en (i.e., English).
        
        NumberFormat nfUSA = NumberFormat.getCurrencyInstance(Locale.US);
        String us = nfUSA.format(payment);
        
        NumberFormat nfIndia = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = nfIndia.format(payment);       

        NumberFormat nfChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = nfChina.format(payment);
        
        NumberFormat nfFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = nfFrance.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
