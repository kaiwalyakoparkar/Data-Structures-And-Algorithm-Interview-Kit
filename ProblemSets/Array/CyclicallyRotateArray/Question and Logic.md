# Cyclically Rotate Array

Given an array, rotate the array by one position in clock-wise direction.

### Example :

```
Input:
	N = 5
	A[] = {1, 2, 3, 4, 5}
	
Output:
	5 1 2 3 4
```

### Logic :

1. #### Traditional Approach: 
    - take the input as array and `t` as no of rotations
    - rotate the loop from `0 to t`
    - store the last element in `temp` and run loop in reverse order till 1<sup>st</sup> location ( `arr[1]` )
    - shift `arr[i] = arr[i - 1]`
    - put `temp` in `arr[0]`
