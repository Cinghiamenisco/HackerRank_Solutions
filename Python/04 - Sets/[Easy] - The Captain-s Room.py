# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

card_a = input()
numbers = list(map(int,input().split()))
for n in numbers:
    if numbers.count(n) == 1:
        print(n)
