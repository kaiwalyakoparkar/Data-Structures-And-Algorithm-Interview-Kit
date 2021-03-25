# Edit Distance

Given two strings s and t. Find the minimum number of operations that need to be performed on str1 to convert it to str2. The possible operations are:

- Insert
- Remove
- Replace

**Example 1:**

```
Input: 
s = "geek", t = "gesek"
Output: 1
Explanation: One operation is required 
inserting 's' between two 'e's of str1.
```

**Answer:**

1. Dynamic Programming Approach O(N ^ 2) Complexity:
    - Take input as `str1` and `str2`
    - create a matrix `dp` of [ str1.length()+1 ] and [ str2.length()+1 ] length.
    - in a for loop of `i` iterate over every row of first column. and put i into it
    - in a for loop of `i` iterate over every column of first row and put i into it.
    - make `n` = `str1.length()` and `m` = `str2.length`
    - Then run a nested `i` and `j` loop.
        - Start `i`<sup>th</sup> loop from 1 to <= `n`
            - Start `j` <sup>th</sup> loop from 1 to <= `m`
            - if charcter at str1's i-1<sup>th</sup> location is equal to charater at str2's j-1<sup>th</sup>
            - Then add dp[i-1][j-1] to dp[i][j]
            - else add minimum of dp[i - 1][j - 1], dp[i - 1][j], dp[i][j - 1] into dp[i][j],
    - At the end print the value at dp[n][n]