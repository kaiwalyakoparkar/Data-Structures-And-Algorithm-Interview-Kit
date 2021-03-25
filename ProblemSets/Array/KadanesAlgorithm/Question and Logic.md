# Kadanes Algorithm

Given an array arr of **N** integers. Find the contiguous sub-array with maximum sum.

### Example :

```
Input:
	N = 5
	arr[] = {1,2,3,-2,5}
	
Output: 9
```
**Explanation :** Max subarray sum is 9 of elements (1, 2, 3, -2, 5) which is a contiguous subarray.

### Logic :

1. #### Worst complexity approach: [ O ( n<sup>3</sup> ) ]
    - Take input as array and declare 2 variables `sum = 0` and `max = arr[0]`.
    - run 3 loops `i = 0` till `i  < arr.length-1`, `j = i+1` till `j < arr.length`, `k = i` till `k = j`.
    - in k<sup>th</sup> loop do `sum += arr[k]` and if `( sum > max )` make `max = sum`.
    - every time you come out of the loop make `sum = 0`.
    - and when you come out of ith loop print `max`.

2. #### Better complexity approach : [ O ( n<sup>2</sup> ) ]
    - Take input as array and declare 2 variables `sum = 0` and `max = arr[0]`.
    - run 2 loops `i = 0` till `i < arr.length-1`, `j = i+1` till `j < arr.length`.
    - in j<sup>th</sup> loop do `sum += arr[k]` and if `( sum > max )` make `max = sum`.
    - every time you come out of the loop make `sum = 0`.
    - and when you come out of ith loop print `max`.

3. #### Kadane's Algorithm: ( O ( n ) )
    - This algorithm is designed for such questions so there is no other logic than this.
    - Take input as an array and declare two variables `sum` and `max`.
    - `sum = 0`, `max = arr[0]`.
    - Traverse the array and check if `sum < 0`. if it is then make `sum = 0`.
    - else `sum += arr[i]` and if `sum > max` then change `max = sum`.
    - after coming out of the loop print the `max`