# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

import re

for tests in range(int(input())):
    try:
        re.compile(input())
        print(True)
    except:
        print(False)
