# Segregate Zero One Two

Given an array of size **N** containing only 0s, 1s, and 2s. sort the array in ascending order.

### Example :

```
Input : 
	N = 5
	arr[]= {0 2 1 2 0}
	
Output : 0 0 1 2 2
```
**Explanation :** 0s 1s and 2s are segregated into ascending order.

### Logic :

1. #### Sorting : 
    - Take the array and sort it ( Using inbuilt function or by implementation)
    - display the array

1. #### Count Technique : 
    - Take the input in the array
    - declare 3 variables zero, one and two. Count the number of 0's, 1's, 2's from the array and increment the variables accordingly.
    - now run the loop across the array. According to the incrementation of the variable and replace the elements with 0, 1 and 2.

1. #### 3 Pointer: 
    - Declare three pointers **low**, **mid** and **high** .
    - **mid** pointer rotates from `low + 1` to high. Use switch case for simplicity.
    - if `arr[mid] is 0` the case will be 1st and it will interchange `arr[low]` and `arr[mid]` . then `low++` and `mid++` .
    - if `arr[mid] is 1` the case will be 2nd and there will be only `mid++` .
    - if `arr[mid] is 2` the case will be 3rd and it will interchange `arr[hig]` and `arr[mid]` . then `high--` .
    - After the looping print the array.