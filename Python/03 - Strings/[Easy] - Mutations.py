# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

def mutate_string(string, position, character):
    return string[:position] + character + string[position+1:]
