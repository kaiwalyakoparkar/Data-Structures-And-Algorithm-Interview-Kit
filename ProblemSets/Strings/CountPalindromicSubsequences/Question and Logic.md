**Question:**

Given a string str of length N, you have to find number of palindromic subsequence (need not necessarily be distinct) which could be formed from the string str.Note: You have to return the answer module 109+7;

**Example 1:**

```
Input:
Str = "abcd"
Output:
4
Explanation:
palindromic subsequence are : "a" ,"b", "c" ,"d"
```

**Logic:**

1. Dynamic Programming Approach :
    - Take the input as string
    - Create a matrix of string.length( )s
    - run 2 nested for loop i=0 and j=i and if the elements watch put 1 at mat[i][j]
    - At the end count the number of 1's in the matrix and print the number.
