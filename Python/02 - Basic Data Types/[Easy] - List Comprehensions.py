# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

if __name__ == '__main__':
    x = int(input())
    y = int(input())
    z = int(input())
    n = int(input())
    
    # i j k - X Y Z
    # i+j+k != N
    X = [values for values in range(0,x+1)]
    Y = [values for values in range(0,y+1)]
    Z = [values for values in range(0,z+1)]
    R = []
    for i in X:
        for j in Y:
            for k in Z:
                if (i+j+k != n):
                    R.append([i,j,k])
    print(R)
