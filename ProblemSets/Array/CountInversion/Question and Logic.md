# Count Inversion

Given an array of integers. Find the Inversion Count in the array.

**Inversion Count :** For an array, inversion count indicates how far (or close) the array is from being sorted. If array is already sorted then the inversion count is 0. If an array is sorted in the reverse order then the inversion count is the maximum. Formally, two elements `a[i]` and `a[j]` form an inversion if `a[i] > a[j]` and `i < j`.

### Example :

```
Input: N = 5, arr[] = {2, 4, 1, 3, 5}
Output: 3
```
**Explanation :** The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1), (4, 3).

### Logic : 

1. #### Bruteforce Approach ( Two pointer ) : 
    - Take input as an array
    - declare integer `count` and make it zero
    - run 2 nested for loops `i = 0` to `i < arr.length` and `j = i+1` to `j < arr.length`
    - and everytime check if `arr[i] > arr[j]`. if yes increment the `count`
2. #### Optimal Approach ( Logic in Merge Sort )
    - To understand the logic <ins>**[CLICK HERE](https://www.youtube.com/watch?v=kQ1mJlwW-c0)**</ins> to watch full explanation video.