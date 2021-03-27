# K<sup>th</sup> Element In Matrix

Given a **N x N** matrix, where every row and column is sorted in non-decreasing order. Find the k<sup>th</sup> smallest element in the matrix.

### Example :

```
Input :
	N = 4
	mat[][] = {{16, 28, 60, 64},
               {22, 41, 63, 91},
               {27, 50, 87, 93},
               {36, 78, 87, 94 }
              };
	K = 3

Output : 27
```
**Explanation :** 27 is the 3rd smallest element.

### Logic :

1. #### Brute-force approach with extra space:
    - Take the input as matrix and k
    - declare an array of n x n space
    - add all the elements of the matrix in the array
    - sort the array
    - print the arr[ k-1] th element

1. #### Optimal approach with min heap
    - Take the input as matrix and k
    - declare a heap (priority queue)
    - add all the elements of the matrix in the heap
    - pop the elements in the heap for k-1 time
    - print the peek of the heap