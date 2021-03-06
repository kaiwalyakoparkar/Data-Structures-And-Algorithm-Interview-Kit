# Median Of Row Wise Sorted Matrix

Given a row wise sorted matrix of size **R x C** where **R** and **C** are always odd, find the median of the matrix.

### Example :

```
Input :
	R = 3, C = 3
	M = [[1, 3, 5], 
             [2, 6, 9], 
             [3, 6, 9]
            ];

Output : 5
```
**Explanation :** Sorting matrix elements gives us {1,2,3,3,5,6,6,9,9}. Hence, 5 is median.

### Logic :

1. #### Naive Approach O(n*m log(n*m)) :
    - Take the input as a 2D array
    - Traverse the marix same as you take input in the matrix and add the elements to the array of size row * column
    - after successfully adding the elements in the array, sort the array
    - then return the element at resultsArr.length/2 th location
