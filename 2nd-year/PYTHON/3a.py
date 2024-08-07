n = int(input("Enter a number:"))
def collatz(number):
    if(number%2==0):
        print(number//2)
        return number//2
    else:
        result=3*number+1
        print(result)
        return result

while n!=1:
    n=collatz(n)