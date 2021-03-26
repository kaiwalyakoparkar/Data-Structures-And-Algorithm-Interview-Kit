# Median Of Two Sorted Arrays With Different Size

Given two sorted arrays **a[]** and **b[]** , the task is to find the median of these sorted arrays, in `O(log n + log m)` time complexity, Where **n** is the number of elements in the first array, and **m** is the number of elements in the second array.

### Example :

```
Input:
	ar1[] = {-5, 3, 6, 12, 15}
	ar2[] = {-12, -10, -6, -3, 4, 10}
				
Output : The median is 3.
```
**Explanation :** The merged array is : `ar3[] = {-12, -10, -6, -5 , -3, 3, 4, 6, 10, 12, 15}` , So the median of the merged array is `3`.

### Logic :

1. #### Merging and finding
    - We have an algorithm to merge two arrays we implemented before.
    - here we have to implement the merging algorithm first then
    - we have to add the length of **arr1** and length of **arr2**
    - if the addition **finLen** is even then the middle element and the element before the middle element has to be added **midAdd** and then print the (addition (midAdd) divided by two)
    - and if the addition is odd then you can directly print the middle element

