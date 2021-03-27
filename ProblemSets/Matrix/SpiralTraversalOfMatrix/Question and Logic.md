# Spiral Traversal Of Matrix

Given a matrix of size **R x C**. Traverse the matrix in spiral form.

### Example :

```
Input :
	R = 4, C = 4
	matrix[][] = {{1, 2, 3, 4},
                  {5, 6, 7, 8},
                  {9, 10, 11, 12},
                  {13, 14, 15,16}
                 };
								 
Output : 
	1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
```

### Logic :

1. #### Traditional approach :
    - create a recursive function that takes a matrix and some variables  as parameters

        (k – starting row index, m – ending row index, l – starting column index, n – ending column index)

    - Check the base cases (stating index is less than or equal to ending index) and print the boundary elements in clockwise manner
    - Print the top row, i.e. Print the elements of kth row from column index l to n, and increase the count of k.
    - Print the right column, i.e. Print the last column or n-1th column from row index k to m and decrease the count of n.
    - Print the bottom row, i.e. if k > m, then print the elements of m-1th row from column n-1 to l and decrease the count of m
    - Print the left column, i.e. if l < n, then print the elements of lth column from m-1th row to k and increase the count of l.
    - Call the function recursively with the values of starting and ending indices of rows and columns.