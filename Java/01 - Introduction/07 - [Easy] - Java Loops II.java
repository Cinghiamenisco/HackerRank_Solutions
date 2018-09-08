// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int tot = a + 1 * b;
            System.out.print(tot);

            for(int k=1; k<n; k++) {
                tot += Math.pow(2,k) * b;
                System.out.print(" " + tot);
            }
            System.out.println();

        }
        in.close();
    }
}
