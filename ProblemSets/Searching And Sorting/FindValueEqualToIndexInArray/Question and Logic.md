**Question :**

Given an array **Arr** of **N** positive integers. Your task is to find the elements whose value is equal to that of its index value.

**Example 1:**

```
Input:
N = 5
Arr[] = {15, 2, 45, 12, 7}
Output: 2
Explanation: Only Arr[2] = 2 exists here.
```

1. Iterate and add O(n) Complexity:
    - Take the input as an array
    - Create a ArrayList " li "
    - Now iterate over the array and find if " i+1 " is equal to the arr [ i ] and if yes then add it to li
    - At the end print the li list
