# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

from collections import deque

class Solution:
    # Write your code here
    stack = []
    queue = deque([])
    
    def pushCharacter(self, c):
        self.stack.append(c)
        return
    
    def popCharacter(self):
        return self.stack.pop()
    
    def enqueueCharacter(self, c):
        self.queue.append(c)
        return
    
    def dequeueCharacter(self):
        return self.queue.popleft()
    
