# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

from collections import defaultdict

a_group = defaultdict(list)
inputs = list(map(int,input().split()))
for i in range(0,inputs[0]):
    a_group[input()].append(str(i+1))

for i in range(0,inputs[1]):
    word = input()
    if word in a_group.keys():
        print(" ".join(a_group[word]))
    else:
        print(-1)
