# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

from itertools import combinations_with_replacement

A = input().split()
for a in list(combinations_with_replacement(sorted(A[0]),int(A[1]))):
    for aIN in a:
        print(aIN,end='')
    print()
