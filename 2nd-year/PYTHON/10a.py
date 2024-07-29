import pandas as pd
# Creating a DataFrame with single-level indexing
data = {
'A': [1, 2, 3],
'B': [4, 5, 6],
'C': [7, 8, 9]
}
df_single = pd.DataFrame(data)
print("Single-Level Indexing DataFrame:")
print(df_single)

arrays = [
['high', 'high', 'med', 'med', 'low', 'low'],
['one', 'two', 'one', 'two', 'one', 'two']
]
index = pd.MultiIndex.from_arrays(arrays, names=('first', 'second'))
data = {'A': [1, 2, 3, 4, 5, 6], 'B': [7, 8, 9, 10, 11, 12]}
df_hierarchical = pd.DataFrame(data, index=index)
print("\nHierarchical Indexing DataFrame:")
print(df_hierarchical)