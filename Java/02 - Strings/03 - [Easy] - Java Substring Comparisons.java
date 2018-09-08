// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco

public static String getSmallestAndLargest(String s, int k) {
    String smallest = s.substring(1);
    String largest = "";

    // Complete the function
    // 'smallest' must be the lexicographically smallest substring of length 'k'
    // 'largest' must be the lexicographically largest substring of length 'k'
    for(int i=0; i<=s.length()-k; i++) {
        smallest = (s.substring(i,i+k).compareTo(smallest) < 0) ? s.substring(i,i+k) : smallest ;
        largest =  (s.substring(i,i+k).compareTo(largest) > 0) ? s.substring(i,i+k) : largest ;
    }

    return smallest + "\n" + largest;
}
