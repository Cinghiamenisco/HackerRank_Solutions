// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        LinkedList<Integer> lista = new LinkedList<Integer>();
        int N = scan.nextInt();
        for (int i=0; i<N; i++) {
            lista.add(scan.nextInt());
        }
        
        int query = scan.nextInt();
        scan.nextLine();
        while (query > 0) {
            
            
            
            String scelta = scan.nextLine();
            if (scelta.equals("Insert")) {
                int a = scan.nextInt();
                Integer b = scan.nextInt();
                if (scan.hasNextLine()) {
                    scan.nextLine();
                }
                lista.add(a, b);
            } else if (scelta.equals("Delete")) {
                int c = scan.nextInt();
                if (scan.hasNextLine()) {
                    scan.nextLine();
                }
                lista.remove(c);
            } else {
                System.out.println("Errore");
            }
            query--;
        }
        
        //output        
        for (int i=0; i<lista.size(); i++) {
            System.out.print(lista.get(i) + " ");
        }
    }
}
