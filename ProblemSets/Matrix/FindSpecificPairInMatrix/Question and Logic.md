# Find Specific Pair In Matrix

Given an **n x n** matrix `mat[n][n]` of integers, find the maximum value of `mat(c, d) – mat(a, b)` over all choices of indexes such that both `c > a` and `d > b`.

### Example :

```
Input :
	mat[N][N] = {{ 1, 2, -1, -4, -20 },
                 { -8, -3, 4, 2, 1 },
                 { 3, 8, 6, 1, 3 },
                 { -4, -1, 1, 7, -6 },
                 { 0, -4,10, -5, 1 }
                };

Output : 18
	The maximum value is 18 as mat[4][2]
	- mat[1][0] = 18 has maximum difference.
```

### Logic :

1. #### Brute-Force Approach O ( n^4 ) complexity :
    - A simple solution would be to apply Brute-Force. For all values mat(a, b) in the matrix, we find mat(c, d) that has maximum value such that c > a and d > b and keeps on updating maximum value found so far. We finally return the maximum value.

1. #### Optimal Approach O ( n ^ 2 ) Complexity :
    - An efficient solution uses extra space. We pre-process the matrix such that index(i, j) stores max of elements in matrix from (i, j) to (N-1, N-1) and in the process keeps on updating maximum value found so far. We finally return the maximum value