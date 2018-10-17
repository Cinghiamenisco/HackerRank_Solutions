# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

from itertools import product

A = list(map(int,input().split()))
B = list(map(int,input().split()))

for result in list(product(A,B)):
    print(result, end = ' ')
