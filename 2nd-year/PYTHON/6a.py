import os

if not os.path.exists('program 6'):
    os.mkdir('program 6')

with open('program 6/file.txt','w') as f:
    f.write('VTU')

with open('program 6/file2.txt','w') as f:
    f.write('University')

with open('program 6/file.txt','r') as file1,open('program 6/file2.txt','r') as file2,open('program 6/file3.txt','w') as file3:
    content =file1.read()+file2.read()
    file3.write(content)