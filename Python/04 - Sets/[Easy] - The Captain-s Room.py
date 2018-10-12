# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

input()
setA = set()
setB = set()
for n in input().split():
    if n in setA:
        setB.add(n)
    else:
        setA.add(n)

print(setA.difference(setB).pop())
