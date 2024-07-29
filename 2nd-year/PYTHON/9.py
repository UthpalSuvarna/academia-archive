import numpy as np
import random
# Creating a NumPy array from a list
array_from_list = np.array([1, 2, 3, 4, 5])
print("Array from list:\n", array_from_list)
# Creating a NumPy array from a tuple
array_from_tuple = np.array((6, 7, 8, 9, 10))
print("Array from tuple:\n", array_from_tuple)
# Creating a NumPy array from a range
array_from_range = np.arange(10, 20)
print("Array from range:\n", array_from_range)
# Creating a 2D NumPy array from a list of lists
array_2d = np.array([[1, 2, 3], [4, 5, 6], [7, 8, 9]])
print("2D Array from list of lists:\n", array_2d)
# Creating a NumPy array of random numbers
random_array = np.random.rand(3, 3)
print("Array of random numbers:\n", random_array)
# Reshaping a 1D array to a 2D array
reshaped_array = array_from_range.reshape(2, 5)
print("Reshaped array:\n", reshaped_array)
# Slicing the array to get a subarray
sliced_array = array_2d[0:2, 1:3]
print("Sliced array:\n", sliced_array)
# Adding array indexes

index_added_array = np.arange(1, 10).reshape(3, 3)
print("Array with indexes added:\n", index_added_array)
# Applying arithmetic functions (addition)
arithmetic_array = array_2d + 10
print("Array after addition:\n", arithmetic_array)
# Applying a logic function (checking elements > 5)
logic_array = array_2d > 5
print("Array with logic applied (elements > 5):\n", logic_array)
# Applying aggregation functions (sum, mean)
sum_array = np.sum(array_2d)
mean_array = np.mean(array_2d)
print("Sum of array elements:", sum_array)
print("Mean of array elements:", mean_array)