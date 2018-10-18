# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

# Complete the time_delta function below.
def time_delta(t1, t2):   
    #converto la stringa in timestamp
    #Sun 10 May 2015 13:54:36 -0000
    
    #Voglio un'oggetto di tipo DATETIME
    a = datetime.datetime.strptime(t1, "%a %d %b %Y %H:%M:%S %z")
    b = datetime.datetime.strptime(t2, "%a %d %b %Y %H:%M:%S %z")
    
    res = abs(int((a-b).total_seconds()))
    print(res)
    
    return str(res)
    
    
    #SUGGESTION:
    #from datetime import datetime as dt

    #fmt = '%a %d %b %Y %H:%M:%S %z'
    #for i in range(int(input())):
    #    print(int(abs((dt.strptime(input(), fmt) - 
    #                   dt.strptime(input(), fmt)).total_seconds())))
