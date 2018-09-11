# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

#!/bin/python3

N = int(input())
if N%2!=0 or N in range(6,21):
    print("Weird")
else:
    print("Not Weird")
    
