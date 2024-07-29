import pandas as pd
# Creating a DataFrame
data = {
'A': [1, 2, 3],
'B': [4, 5, 6],
'C': [7, 8, 9]
}
df = pd.DataFrame(data)

# Arithmetic operation
df['D'] = df['A'] + df['B']
print("\nArithmetic Operation (A + B):")
print(df)

# Boolean operation
df['E'] = df['C'] > 7
print("\nBoolean Operation (C > 7):")
print(df)