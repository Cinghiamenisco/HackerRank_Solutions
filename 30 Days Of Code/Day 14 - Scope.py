# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco
    
    def computeDifference(self):
        
        self.maximumDifference = float('-inf')
        
        for k in self.__elements:
            for j in self.__elements[1:]:
                if (abs(k-j) > self.maximumDifference):
                    self.maximumDifference = abs(k-j)
