# Row With Maximum Ones

Given a boolean 2D array of **n x m** dimensions where each row is sorted. Find the 0-based index of the first row that has the maximum number of **1's**.

### Example :

```
Input : 
	N = 4 , M = 4
	Arr[][] = {{0, 1, 1, 1},
                   {0, 0, 1, 1},
                   {1, 1, 1, 1},
                   {0, 0, 0, 0}
                  };

Output : 2
```
**Explanation :** Row 2 contains 4 1's (0-based indexing).

### Logic :

1. #### Naive Approach O ( n * m) :
    - Take input as 2D matrix
    - Declare an array " count "of row size
    - Traverse the matrix row wise and see for every row count the number of 1's and add it to the array
    - after that traverse the count array and find the index of the maximum element
    - print the index

1. #### Optimal Approach O ( n+m ) :
    - Declare 2 variables max2 as minimum in integers, and ans = -1
    - Traverse the matrix as usual and count the number of 1's for every row
    - after the traversal of every row check if max2 is lesser than point and point is greater than 0, if yes then make max2 = point & ans = i
    - print the answer at the end
