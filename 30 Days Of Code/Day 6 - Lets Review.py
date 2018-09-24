# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

n = int(input())
for i in range(0,n):
    s = str(input())

    for k in range(0,len(s),2):
        print(s[k],end='')
    print('',end=' ')
    for k in range(1,len(s),2):
        print(s[k],end='')
    print()
