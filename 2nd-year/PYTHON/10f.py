import pandas as pd
# Reading data from a CSV file
df_from_csv = pd.read_csv('C:/Users/Student/ans.csv')
print("\nDataFrame Read from CSV:")
print(df_from_csv)

import pandas as pd
# Creating a DataFrame
data = {
'A': [1, 2, 3],
'B': [4, 5, 6],
'C': [7, 8, 9]
}
df = pd.DataFrame(data)
# Writing DataFrame to a CSV file
df.to_csv('output.csv', index=False)
print("\nDataFrame Written to CSV (C:/Users/Student/output.csv)")