// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco

class MyCalculator implements AdvancedArithmetic {
    
    public int divisor_sum(int n) {
        int tot = 0;
        for (int i=1; i<=n; i++) {
            if (n%i==0)
                tot += i;
        }
        return tot;
    }
}
