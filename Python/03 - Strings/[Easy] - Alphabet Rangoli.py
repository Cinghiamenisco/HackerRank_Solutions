# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

def print_rangoli(size):
    # your code goes here
    for i in range(-size+1,size):
        for k in range(-size+1,size):
            bck = k
            i = abs(i)
            k = abs(k)
            if (i+k) < size:
                print(chr(65+32+i+k),end=('-' if bck != size-1 else ''))
            else:
                print("-",end= ('' if bck == size-1 else '-'))
        print()        
