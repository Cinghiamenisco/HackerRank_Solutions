// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco

//Write your code here
/*        for(String mm:s) {
    System.out.println(mm);
}
*/
String[] nuovo = Arrays.copyOf(s, s.length-2);

/*
BigDecimal[] test = new BigDecimal[n];
for(int i=0; i<n; i++) {
test[i] = new BigDecimal(s[i]);
}
*/


Arrays.sort(nuovo, new Comparator<String>() {
@Override
public int compare(String bd1, String bd2) {
    BigDecimal uno = (new BigDecimal(bd1));
    BigDecimal due = (new BigDecimal(bd2));
    return due.compareTo(uno);
    }
});

s = nuovo;
