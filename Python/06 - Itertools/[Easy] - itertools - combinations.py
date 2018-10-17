# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

from itertools import combinations

a = input().split()
for i in range(1,int(a[1])+1):
    for k in list(combinations(sorted(a[0]),i)):
        for kIN in k:
            print(kIN,end='')
        print()
