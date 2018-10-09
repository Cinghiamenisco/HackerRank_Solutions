# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

if __name__ == '__main__':
    N = int(input())
    
    L = []
    
    for i in range (0,N):
        op = input().split()
        if (op[0] == "insert"):
            L.insert(int(op[1]),int(op[2]))
        elif (op[0] == "print"):
            print(L)
        elif (op[0] == "remove"):
            L.remove(int(op[1]))
        elif (op[0] == "append"):
            L.append(int(op[1]))
        elif (op[0] == "sort"):
            L.sort()
        elif (op[0] == "pop"):
            L.pop()
        elif (op[0] == "reverse"):
            L.reverse()
