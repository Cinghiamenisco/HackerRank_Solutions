# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

for num in range(int(input())):
    ins = input().split()
    try:
        print(int(ins[0]) // int(ins[1]))
    except ZeroDivisionError as ze:
        print("Error Code: " + str(ze))
    except ValueError as ve:
        print("Error Code: " + str(ve))
