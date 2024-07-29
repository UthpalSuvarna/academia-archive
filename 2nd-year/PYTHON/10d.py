import pandas as pd
# Creating DataFrames to merge
left = pd.DataFrame({'key': ['K0', 'K1', 'K2'], 'A': ['A0', 'A1', 'A2']})
right = pd.DataFrame({'key': ['K0', 'K1', 'K2'], 'B': ['B0', 'B1', 'B2']})

# Merging DataFrames
merged = pd.merge(left, right, on='key')
print("\nMerged DataFrame:")
print(merged)