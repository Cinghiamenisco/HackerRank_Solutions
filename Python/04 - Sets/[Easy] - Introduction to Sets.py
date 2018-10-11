# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

def average(array):
    # your code goes here
    plants = set(array)
    return sum(plants)/len(set(plants))
