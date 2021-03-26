# Sub Array With Zero Sum

Given an array of positive and negative numbers. Find if there is a **subarray** (of size at-least one) with **0 sum**.

### Example :

```
Input:
	5
	4 2 -3 1 6

Output : Yes
```
**Explanation :** 2, -3, 1 is the subarray with sum 0.

### Logic :

1. #### Optimal approach with O ( n ) complexity
    - Take input as array
    - create two variables `int sum = 0` and `boolean isZero = false` .
    - declare a hash set `hst` .
    - run a loop through the array and .
    - `sum += arr[i]` .
    - then check if `arr[i] == 0` ***or*** `sum == 0` ***or*** `arr[i]` is present in `hst` ( hash set ) .
    - if any of the condition is true make `isZero = true` .
    - at last if `isZero` is true then print `yes` elese print `false` .