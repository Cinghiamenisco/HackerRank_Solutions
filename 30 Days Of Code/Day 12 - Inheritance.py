# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

class Student(Person):
    
    firstName = ""
    lastName = ""
    idNumber = -1
    scores = [0]

    def __init__(self, firstName, lastName, idNumber, scores):
        self.firstName = firstName
        self.lastName = lastName
        self.idNumber = idNumber
        self.scores = scores
        
    def calculate(self):
        avg = 0
        count = 0
        for grades in scores:
            avg += grades
            count += 1
        avg = avg / count
        if avg < 40:
            return "T"
        elif avg < 55:
            return "D"
        elif avg < 70:
            return "P"
        elif avg < 80:
            return "A"
        elif avg < 90:
            return "E"
        elif avg <= 100:
            return "O"
        else:
            print("ERRORE")
            return z           
        
