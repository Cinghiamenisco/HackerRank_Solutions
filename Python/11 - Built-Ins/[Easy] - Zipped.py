# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

n = input().split()
alunni = []
for i in range(int(n[1])):
    alunni.append(map(float,input().split()))
    
for i in zip(*alunni):
    print(sum(i)/len(i))
