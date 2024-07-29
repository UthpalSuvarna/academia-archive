import pandas as pd
import numpy as np
# Creating a DataFrame with missing data
data = {
'A': [1, 2, np.nan],
'B': [4, np.nan, 6],
'C': [7, 8, 9]
}

df_missing = pd.DataFrame(data)
print("\nDataFrame with Missing Data:")
print(df_missing)

# Handling missing data
df_filled = df_missing.fillna(0)
print("\nFilled Missing Data:")
print(df_filled)

df_dropped = df_missing.dropna()
print("\nDropped Missing Data:")
print(df_dropped)