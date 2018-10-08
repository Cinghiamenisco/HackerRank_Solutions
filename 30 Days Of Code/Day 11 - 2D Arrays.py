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
    arr = []
    
    maxHourglass = float('-inf')
    
    for _ in range(6):
        arr.append(list(map(int, input().rstrip().split())))
    
    for row in range(0, len(arr)):
        for col in range(0, len(arr)):
            try:
                tmpHourglass = (arr[row][col] + arr[row][col+1] + arr[row][col+2] + 
                                arr[row+1][col+1] + 
                                arr[row+2][col] + arr[row+2][col+1] + arr[row+2][col+2])
            except:
                continue
                
            if tmpHourglass > maxHourglass:
                maxHourglass = tmpHourglass
                
    print(maxHourglass)
