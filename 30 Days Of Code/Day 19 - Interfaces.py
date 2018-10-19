# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

class Calculator(AdvancedArithmetic):
    def divisorSum(self, n):
        tot = 0
        for i in range (1,n+1):
            if (n % i == 0):
                tot += i
        return tot
