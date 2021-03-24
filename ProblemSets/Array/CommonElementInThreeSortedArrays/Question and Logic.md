# Common Element In Three Sorted Arrays

Given three arrays sorted in increasing order. Find the elements that are common in all three arrays.**Note:** can you take care of the duplicates without using any additional Data Structure?

### Example :

```
Input:
	n1 = 6; A = {1, 5, 10, 20, 40, 80}
	n2 = 5; B = {6, 7, 20, 80, 100}
	n3 = 8; C = {3, 4, 15, 20, 30, 70, 80, 120}
	
Output:
	20 80
```
**Explanation :** 20 and 80 are the only common elements in A, B and C.

### Logic :

1. #### BruteForce  Approach:
    - run three nested loops and check if the elements are same if same then add them to arraylist.

2. #### Better Approach : 
    - creating a max variable for storing the maximum
    - value present in the all the three array this will be the size of array for calculating the frequency of each element present in all the array
    - deleting duplicates in linear time
    for `arr1`
    - deleting duplicates in linear time
    for `arr2`
    - deleting duplicates in linear time
    - for `arr3`
    - creating an array for finding frequency
    - calculating the frequency of all the elements present in all the array
    - iterating till max and whenever the frequency of element will be three we print that element