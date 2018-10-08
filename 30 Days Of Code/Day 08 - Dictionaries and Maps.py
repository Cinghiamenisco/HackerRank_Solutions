# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

n = int(input(""))

rubrica = {}
     
for k in range (0,n):
    values = input()
    tokens = values.split() # returns a list (ArrayList) of tokenized values
    try:
        x = tokens[0]   # sets x,y,z to the first three tokens
        y = tokens[1]
        rubrica[tokens[0]] = tokens[1]
    except IndexError:       # if 0,1,2 are out of bounds
        print("You must enter 2 values")
        
while (True):
    try:
        name = input()
    except EOFError:
        break
        
    try:
        print("%s=%s" % (name, rubrica[name]))
    except:
        print("Not found")
