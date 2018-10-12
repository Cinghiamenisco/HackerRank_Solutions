# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

card_a = input()
a = set(map(int,input().split()))

number_of_sets = int(input())
while number_of_sets > 0:
    
    cmd = input().split()
    temporary_set = set(map(int,input().split()))
    
    if cmd[0] == "intersection_update":
        a.intersection_update(temporary_set)
    elif cmd[0] == "symmetric_difference_update":
        a.symmetric_difference_update(temporary_set)
    elif cmd[0] == "update":
        a.update(temporary_set)
    elif cmd[0] == "difference_update":
        a.difference_update(temporary_set)
    
    number_of_sets -= 1
    
print(sum(a))
