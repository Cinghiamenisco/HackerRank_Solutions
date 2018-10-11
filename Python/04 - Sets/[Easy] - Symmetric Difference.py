# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

m = input()
mset = set(map(int,input().split()))
n = input()
nset = set(map(int,input().split()))
res = mset.union(nset).difference(mset.intersection(nset))
res = list(res)
res.sort()
for l in res:
    print(l)
