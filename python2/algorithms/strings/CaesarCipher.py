#!/usr/bin/python
from string import digits, lowercase, punctuation

k = 0
def replace(c):
    characters = 'abcdefghijklmnopqrstuvwxyz'
    key = characters[k%26:] + characters[:k%26]
    key += key.upper() + digits + punctuation
    characters += characters.upper() + digits + punctuation
    return key[characters.index(c)]

def caesarCipher(s):
    return ''.join(map(replace, s))
