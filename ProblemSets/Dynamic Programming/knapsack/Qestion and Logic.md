You are given weights and values of N items, put these items in a knapsack of capacity W to get the maximum total value in the knapsack. Note that we have only one quantity of each item.
In other words, given two integer arrays val[0..N-1] and wt[0..N-1] which represent values and weights associated with N items respectively. Also given an integer W which represents knapsack capacity, find out the maximum value subset of val[] such that sum of the weights of this subset is smaller than or equal to W. You cannot break an item, either pick the complete item, or don’t pick it (0-1 property).

**Example 1:**
```
Input:
N = 3
W = 4
weight[] = {4,5,1}
values[] = {1,2,3}
Output: 3
```

**Example 2:**
```
Input:
N = 3
W = 3
weight[] = {4,5,6}
values[] = {1,2,3}
Output: 0
```

**Answer :**
Check this [video](https://youtu.be/xCbYmUPvc2Q). See from 9:00 min timestamp

Basic Idea.
1. Take the jth row as your budget and the ith row (Where there are all the weights) is the price of the item.
2. If you can't afford it take the value in the dp from the upper row
3. If you can afford it then compare the upper row value `dp[i-1][j]` with the value in the `dp[i-1][j-val[i]] + val[i]` and see for the largest of them.
