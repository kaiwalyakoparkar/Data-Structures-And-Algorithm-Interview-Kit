# Median Of Two Sorted Arrays With Equal Size

There are 2 sorted arrays **A** and **B** of size **n** each. Write an algorithm to find the median of the array obtained after merging the above 2 arrays( i.e. array of length **2n** ). The complexity should be `O(log(n))`.

### Example :
```
Input :
	arr1[] = {1 ,12, 15, 26, 38}
	arr2[] = {2, 13, 17, 30, 45}
	
Output : 16
```
Explaination : after merging these two arrays the middle elements are 15 and 17 so (15+17)/2 so the answer is 16.

### Logic : 

1. #### Merging and finding :
    - We have an algorithm to merge two arrays we implemented before.
    - here we have to implement the merging algorithm first then
    - we have to add the length of **arr1** and length of **arr2**
    - if the addition **finLen** is even then the middle element and the element before the middle element has to be added **midAdd** and then print the (addition (midAdd) divided by two)
    - and if the addition is odd then you can directly print the middle element
.