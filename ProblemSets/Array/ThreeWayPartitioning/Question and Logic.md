# Three Way Partitioning

Given an array of size **N** and a range [**a**, **b**]. The task is to partition the array around the range such that array is divided into three parts.
1. All elements smaller than **a** come first.
1. All elements in range **a** to **b** come next.
1. All elements greater than **b** appear in the end.

The individual elements of three sets can appear in any order. You are required to return the modified array.

### Example :

```
Input : 
	N = 5
	A[] = {1, 2, 3, 3, 4}
	[a, b] = [1, 2]
	
Output : 1
```
**Explanation :** One possible arrangement is: {1, 2, 3, 3, 4}. If you return a valid arrangement, output will be 1 .

### Logic :

1. #### Sorting of the array :
    - Take the input as an array and two limits [ x , y]
    - Sort the array
    - Print the sorted array

1. #### Dutch National Flag Approach :
    - Traverse elements from left
    - If current element is smaller than  range, put it on next available smaller position.
    - If current element is greater than  range, put it on next available greater position.
    - At the end print the array