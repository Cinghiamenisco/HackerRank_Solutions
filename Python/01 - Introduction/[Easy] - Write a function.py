# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

def is_leap(year):
    leap = False
    
    if year%4==0:
        leap = True
        if year%100 == 0:
            leap = False
            if year%400 == 0:
                leap = True
    
    return leap
