# Trapping Water Problem

Given an array **arr[]** of **N** non-negative integers representing the height of blocks. If width of each block is 1, compute how much water can be trapped between the blocks during the rainy season. 

### Example :

```
Input :
	N = 6
	arr[] = {3,0,0,2,0,4}

Output : 10
```

### Logic :

1. #### Brute-Force Approach O( n ^ 2 ) complexity :

    - **Approach:** The idea is to traverse every array element and find the highest bars on left and right sides. Take the smaller of two heights. The difference between the smaller height and height of the current element is the amount of water that can be stored in this array element.

    - **Algorithm:**
        - Traverse the array from start to end.
        - For every element, traverse the array from start to that index and find the maximum height  and traverse the array from the current index to end and find the maximum height between (a) and (b)
        - The amount of water that will be stored in this column is , add this value to total amount of water stored

            min(a,b) – array[i]

        - Print the total amount of water stored.

1. #### Optimal Approach with O( n ) complexity : 

    - **Approach:** In the previous solution, to find the highest bar on the left and right, array traversal is needed which reduces the efficiency of the solution. To make this efficient one must pre-compute the highest bar on the left and right of every bar in linear time. Then use these pre-computed values to find the amount of water in every array element.

    - **Algorithm:**
        - Create two array  and  of size n. create a variable .left right max_ = INT_MIN
        - Run one loop from start to end. In each iteration update max_ as  and also assign max_ = max(max_, arr[i]) left[i] = max_
        - Update max_ = INT_MIN.
        - Run another loop from end to start. In each iteration update max_ as  and also assign max_ = max(max_, arr[i]) right[i] = max_
        - Traverse the array from start to end.
        - The amount of water that will be stored in this column is ,(where a = left[i] and b = right[i]) add this value to total amount of water stored min(a,b) – array[i]
        - Print the total amount of water stored.

        Space Optimization : Instead of maintaing two arrays of size n for storing left and right max of each element, maintain two variables to store the maximum till that point. Since water trapped at any element = min(max_left, max_right) – arr[i]. Calculate water trapped on smaller element out of A[lo] and A[hi] first and move the pointers till lo doesn’t cross hi.