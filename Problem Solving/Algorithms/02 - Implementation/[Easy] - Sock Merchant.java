// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco

// Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {

        int totalNumberOfMatchedSocks = 0;

        Set<Integer> calziniSingoli = new HashSet<Integer>();

        for(int i=0; i<ar.length; i++) {

            if (calziniSingoli.contains(ar[i])) {
            
                totalNumberOfMatchedSocks++;
                calziniSingoli.remove(ar[i]);
                
            } else {
            
                calziniSingoli.add(ar[i]);
                
            }
        }
        return totalNumberOfMatchedSocks;
    }
