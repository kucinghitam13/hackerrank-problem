#!/usr/bin/python
from string import ascii_lowercase, ascii_uppercase, digits

#first try
def minimumNumber(n, password):
    need = 0
    if not any(char in password for char in ascii_lowercase):
        need += 1
    if not any(char in password for char in ascii_uppercase):
        need += 1
    if not any(char in password for char in digits):
        need += 1
    if not any(char in password for char in '!@#$%^&*()-+'):
        need += 1
    return max(need, 6-n)
    
#best
def minimumNumber2(n, password):
    return max(6 - len(password), sum(not (set(st) & set(password)) for st in (digits, ascii_lowercase, ascii_uppercase, "!@#$%^&*()-+")))
