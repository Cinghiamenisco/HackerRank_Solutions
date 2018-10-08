# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco
    
    def insert(self,head,data):
        if (head == None):
            head = Node(data)
            return head
        if (head.next == None):
            head.next = Node(data)
            return head
        
        self.insert(head.next, data)
        return head
