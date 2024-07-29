# Write a python program to check if the number is an Armstrong number or not.
num = int(input("Enter a number: "))
length = len(str(num))
sum = 0
temp = num
while temp > 0:
    digit = temp % 10
    sum = sum+ digit ** length
    temp = temp//10
print("The number is", num, "and the sum is", sum)
if num == sum:
    print(num, "is an Armstrong number")
else:
    print(num, "is not an Armstrong number")