# Sorted Matrix

Given an **N x N** matrix Mat. Sort all elements of the matrix.

### Example :

```
Input :
	N=4
	Mat=[[10,20,30,40],
             [15,25,35,45],
             [27,29,37,48],
             [32,33,39,50]
            ];

Output :
	10 15 20 25 
	27 29 30 32
	33 35 37 39
	40 45 48 50
```
**Explanation :** Sorting the matrix gives this result.

### Logic :

1. #### Brute-Force approach with extra space : O(N^2 logn) & O(n)
    - Take input as 2D matrix and "n"
    - create a temp array of n*n size ( temp [ n*n ])
    - traverse the matrix and put elements one by one in the temp array
    - after that sort the temp array (Using inbuilt library or implmenting by self)
    - overrite the elements in the matrix with the sorted elements in the temp array
    - At last print the matrix
