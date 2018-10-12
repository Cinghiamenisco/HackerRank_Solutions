# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

test_cases = int(input())

while (test_cases > 0):
    
    card_temp_set_a = input()
    temp_set_a = set(input().split())
    card_temp_set_b = input()
    temp_set_b = set(input().split())
    
    if len(temp_set_a)>len(temp_set_b):
        print("False")
        test_cases -= 1
        continue
    
    if (len(temp_set_a.difference(temp_set_b)) == 0):
        print("True")
    else:
        print("False")
    
    test_cases -= 1
