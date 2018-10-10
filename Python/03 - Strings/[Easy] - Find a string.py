# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

def count_substring(string, sub_string):
    count = 0
    for i in range (0,len(string)):
        if sub_string == string[i:i+3]:
            count += 1
    return count
