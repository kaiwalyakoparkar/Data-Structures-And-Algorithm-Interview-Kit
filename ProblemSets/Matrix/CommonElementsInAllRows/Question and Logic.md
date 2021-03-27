# Common Elements In All Rows

Given an **m x n** matrix, find all common elements present in all rows in **O(mn)** time and one traversal of matrix.

### Example :

```
Input :
	mat[4][5] = {{1, 2, 1, 4, 8},
                     {3, 7, 8, 5, 1},
                     {8, 7, 7, 3, 1},
                     {8, 1, 2, 7, 9},
                    };

Output :
	1 8 or 8 1
	8 and 1 are present in all rows.
```

### Logic :

1. #### Brute-Force approach O(n^2 * m^2) :
    - Take input as matrix
    - Run 4 loops for every element in the first row to check if it present in all other rows

1. #### Better Approach O(n * logm) :
    - Take input as matrix
    - A better solution is to sort all rows in the matrix and use similar approach as discussed here. Sorting will take O(mnlogn) time and finding common elements will take O(mn) time. So overall time complexity of this solution is O(mnlogn)

1. #### Optimal Approach O(n*m) :
    - Take input as matrix
    - The idea is to use maps.
    - We initially insert all elements of the first row in an map. For every other element in remaining rows, we check if it is present in the map.
    - If it is present in the map and is not duplicated in current row, we increment count of the element in map by 1, else we ignore the element. If the currently traversed row is the last row, we print the element if it has appeared m-1 times before.
