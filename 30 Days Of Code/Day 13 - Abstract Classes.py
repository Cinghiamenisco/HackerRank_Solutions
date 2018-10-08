# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

class MyBook (Book):
    
    def __init__(self,title, author, price):
        Book.__init__(self,title,author)
        self.price = price
        
    def display(self):
        print("Title: %s" % (self.title))
        print("Author: %s" % (self.author))
        print("Price: %s" % (self.price))
        
