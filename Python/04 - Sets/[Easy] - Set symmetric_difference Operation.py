# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

card_a = input()
a = set(map(int, input().split()))
card_b = input()
b = set(map(int, input().split()))
print(len(a.symmetric_difference(b)))
