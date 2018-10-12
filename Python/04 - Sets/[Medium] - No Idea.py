# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

input()
numbers = list(input().split())
like_set_a = set(input().split())
dislike_set_b = set(input().split())
happiness = 0
for n in numbers:
    if n in like_set_a:
        happiness += 1
    if n in dislike_set_b:
        happiness -= 1
        
print(happiness)
