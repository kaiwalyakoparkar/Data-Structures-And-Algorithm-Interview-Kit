# Minimise The Maximum Difference Between Heights

Given an array **arr[]** denoting heights of **N** towers and a positive integer **K**, you have to modify the height of each tower either by increasing or decreasing them by **K** only once. After modifying, height should be a **non-negative** integer. Find out what could be the possible minimum difference of the height of shortest and longest towers after you have modified each tower.

### Example :

```
Input :
	K = 2, N = 4
	Arr[] = {1, 5, 8, 10}
	
Output : 5
```
**Explanation :** The array can be modified as {3, 3, 6, 8}. The difference between the largest and the smallest is 8-3 = 5.

### Logic :

1. #### Naive Approach O(n logn): 
    - The idea is to sort all elements increasing order. And for all elements check if subtract(element-k) and add(element+k) makes any changes or not.
    - Below is the implementation of the above approach:
    - Sort the given array
    - after sorting declare 3 variables namely
    - ans = last element - first element
    - small = first element + k
    - big = last element - k
    - place pointer on second element and subtrack  = arr [ i ]  - k and then add = arr [ i ] + k
    - if add < big do nothing
    - if subtrack > small do nothing
    - at last return min ( ans, big-small)