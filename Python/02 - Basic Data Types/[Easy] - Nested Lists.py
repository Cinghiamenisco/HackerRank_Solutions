if __name__ == '__main__':
    L = []
    for _ in range(int(input())):
        name = input()
        score = float(input())
        L.append([score,name])
    
    #Codice che mi vergogno di aver scritto
    T = []
    L.sort(reverse=True)
    T.append(L.pop())
    
    for l in L:
        if l[0] == T[0][0]:
            T.append(L.pop())
    
    Ta = []
    Ta.append(L.pop())
    
    for l in L:
        if l[0] == Ta[0][0]:
            Ta.append(L.pop())
        
    Tar = []
    for ta in Ta:
        Tar.append(ta[1])
        
    Tar.sort()
    for tar in Tar:
        print(tar)
