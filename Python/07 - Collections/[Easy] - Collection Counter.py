# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

from collections import Counter

earns = 0
number_of_shoes = int(input())
shoe_size_list = list(map(int,input().split()))
for i in range(0,int(input())):
    
    values = list(map(int,input().split()))
    if values[0] in shoe_size_list:
        shoe_size_list.remove(values[0])
        earns += values[1]

print(earns)
