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

    arr = list(map(int, input().rstrip().split()))

    for i in range (len(arr)-1, -1, -1):
        print(arr[i], end=' ')
