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
    N = int(input())
    
    if N%2==1:
        print("Weird")
    elif N>=2 and N<= 5:
        print("Not Weird")
    elif N>=6 and N <=20:
        print("Weird")
    elif N>20:
        print("Not Weird")
    else:
        print("Input non valido")
