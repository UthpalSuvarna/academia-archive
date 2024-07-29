binary = input("Enter a binary number:")
def BinaryToDecimal(binary):
    decimal=0
    for digit in binary:
        decimal = 2*decimal + int(digit)
    print("The decimal value is:", decimal)
BinaryToDecimal(binary)