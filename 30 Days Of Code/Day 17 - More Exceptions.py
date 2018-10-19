# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

import math

class Calculator:
    
    def power(self, n, p):
        
        if n < 0 or p < 0:
            raise ValueError("n and p should be non-negative")
            
        return int(math.pow(n,p))
