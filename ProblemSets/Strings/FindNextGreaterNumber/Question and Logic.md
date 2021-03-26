**Question:** 

Implement the next permutation, which rearranges the list of numbers into Lexicographically next greater permutation of list of numbers. If such arrangement is not possible, it must be rearranged to the lowest possible order *i.e.* sorted in an ascending order. You are given an list of numbers **arr[ ]** of size **N**.

**Example 1:**

```
Input: N = 6
arr = {1, 2, 3, 6, 5, 4}
Output: {1, 2, 4, 3, 5, 6}
Explaination: The next permutation of the
given array is {1, 2, 4, 3, 5, 6}.
```

1. Optimal Approach : 
    - Take the input as the array
    - make a varible `int idx1 = -1`  & `int idx2 = -1`
    - Traverse the array in reverse order and find if `arr [ i ] < arr [ i + 1 ]` make `idx1 = i` and break the loop
    - if idx1 is -1 then `reverse ( arr , 0)` // reverse entire array
    - else Traverse the array in the reverse order till `idx + 1` and check if any element is greater than mark
    - when found make the `idx2 = i` and break the loop
    - swap the `arr [ mark ]` and `arr [ idx ]`
    - then reverse the array from `arr [ idx1+1 ]` to `arr [ arr.length ]`