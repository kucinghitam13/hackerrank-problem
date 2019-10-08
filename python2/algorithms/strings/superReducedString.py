#!/usr/bin/python
import re

#first try
def superReducedString(s):
    allchar = [char*2 for char in list(set(s)) if char*2 in s]
    while(len(allchar)>0):
        for char in allchar:
            s = s.replace(char, '')
        allchar = [char*2 for char in list(set(s)) if char*2 in s]
    return s if s != '' else 'Empty String'

#best
def superReducedString2(s):
    while(True):
        length = len(s)
        s = re.sub(r'(.)\1', '', s)
        if length == len(s):
            break
    return s if s != '' else 'Empty String'
