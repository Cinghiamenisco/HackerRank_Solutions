#!/bin/python3

# Autore:      Christian Luzzetti
# Mail:        Christian.luzzetti@gmail.com
# HackerRank:  https://www.hackerrank.com/Cinghiamenisco

import math
import os
import random
import re
import sys

if __name__ == '__main__':
    n = int(input())
    
    maxOnes = 0;
    count = 0;
    for k in bin(n)[2:]:
        if k == "1":
            count += 1
            if count > maxOnes:
                maxOnes = count
        else:
            count = 0
    
    print(maxOnes)
            
