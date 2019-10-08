#!/usr/bin/python
import itertools

#first try
def alternate(s):
    allchar, maxchar = set(s), 0
    if len(allchar) == 2 and not any(cr*2 in s for cr in allchar):
        return len(s)
    elif len(allchar) > 2:
        for c in itertools.combinations(allchar, len(allchar) - 2):
            char = allchar - set(c)
            res = s.translate(None, ''.join(c))
            if not any(cr*2 in res for cr in char) and len(res) >= 2:
                maxchar = max(maxchar, len(res))
    else:
        return 0
    return maxchar
