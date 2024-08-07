number =int(input("Enter a number:"))
arr=[]

for num in range(2,number):
    if number>1:
        for i in range (2,num):
            if(num%i)==0:
                break
        else:
            arr.append(num)

flag=0
for i in range(len(arr)):
    for j in range (i+1,len(arr)):
        if arr[i]+arr[j]==number:
            print(arr[i],arr[j])
            flag=1
            break
if(flag==0):
    print("Not possible")
 