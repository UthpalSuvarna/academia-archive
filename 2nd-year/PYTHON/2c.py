import re
string='Hi Hello'
pattern='Hello'
result=re.search(pattern,string)
print(result)
if result:
    print('search found')
    print('start index', result.start())
    print('end index', result.end())
    print('start and end index', result.span())
else:
    print('search not found')