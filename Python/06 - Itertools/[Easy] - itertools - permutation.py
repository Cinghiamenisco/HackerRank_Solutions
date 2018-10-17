# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

from itertools import permutations

A = input().split()
perm = list(permutations(A[0],int(A[1])))
perm.sort()
for p in perm:
    for pIN in p:
        print(pIN,end='')
    print()
