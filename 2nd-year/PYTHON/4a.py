N = int(input("Enter the number of elements: "))
numbers = []
for i in range(N):
    num = int(input("Enter a number: "))
    numbers.append(num)
sum_even = 0
product_odd = 1
for num in numbers:
    if num % 2 == 0:
        sum_even = sum_even + num
    else:
        product_odd = product_odd * num
print("Sum of all even numbers:", sum_even)
print("Product of all odd numbers:", product_odd)