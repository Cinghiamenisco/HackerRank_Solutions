# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

from itertools import groupby

stringa = input()

b = groupby(stringa)
for c,d in b:
    print((len(list(d)),int(c)),end=' ')

#one-Line
#print(*[(len(list(g)),int(k)) for k,g in groupby(stringa)])
