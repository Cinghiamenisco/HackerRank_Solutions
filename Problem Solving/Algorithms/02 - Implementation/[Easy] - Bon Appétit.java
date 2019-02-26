// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco

public class Solution {

    // Complete the bonAppetit function below.
    static void bonAppetit(List<Integer> bill, int k, int b) {

        int prezzoEquoDellaCena = 0;
        int prezzoTotaleDellaCena = 0;

        for (Integer i : bill) {
            prezzoTotaleDellaCena += i;
        }

        prezzoEquoDellaCena = prezzoTotaleDellaCena - bill.get(k);

        int prezzoTotalePersona = (int) prezzoTotaleDellaCena / 2;
        int prezzoEquoPersona = (int) prezzoEquoDellaCena / 2;

        if (prezzoEquoPersona == b) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - prezzoEquoPersona);
        }

    }
