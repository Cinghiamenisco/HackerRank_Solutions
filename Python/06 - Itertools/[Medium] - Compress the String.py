# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

from itertools import groupby

stringa = input()

print(*[(len(list(g)),int(k)) for k,g in groupby(stringa)])
