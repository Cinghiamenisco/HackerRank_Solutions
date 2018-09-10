// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco

    static boolean isAnagram(String a, String b) {
        // Complete the function
        
        if (a.length() != b.length())
            return false;
        
        //Inizializzo l'array a 0
        int[] ASCIIresults = new int[128];
        for (int i=0; i<128; i++) {
            ASCIIresults[i] = 0;
        }
        
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        for (int i=0; i<a.length(); i++) {
            ASCIIresults[a.charAt(i)]++;
            ASCIIresults[b.charAt(i)]--;
        }
        
        for(int i=0; i<128; i++) {
            if (ASCIIresults[i] != 0)
                return false;
        }
        
        return true;
    }
