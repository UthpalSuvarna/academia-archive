import pandas as pd
import matplotlib.pyplot as plt
# Creating a DataFrame
data = {
'A': [1, 2, 3],
'B': [4, 5, 6],
'C': [7, 8, 9]
}
df = pd.DataFrame(data)
# Plotting individual columns
df['A'].plot(kind='bar', title='Column A')
plt.show()
# Plotting the whole table
df.plot(kind='line', title='Whole Table')
plt.show()