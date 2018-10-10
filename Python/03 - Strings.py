# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

def swap_case(s):
    res = []
    for c in s:
        if ord(c) >= 97 and ord(c) <= 122:
            res.append(chr(int(ord(c)-32)))
        elif ord(c) >= 65 and ord(c) <= 90:
            res.append(chr(int(ord(c)+32)))
        else:
            res.append(c)
            
    return "".join(res)
