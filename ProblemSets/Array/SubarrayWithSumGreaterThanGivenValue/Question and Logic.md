# Subarray With Sum Greater Than Given Value

Given an array of integers (**A[]**)  and a number **x**, find the smallest subarray with sum greater than the given value.

**Note:** The answer always exists. It is guaranteed that **x** doesn't exceed the summation of `a[i]` (from 1 to N).

### Example :

```
Input :
	A[] = {1, 4, 45, 6, 0, 19}
	x  =  51
	
Output : 3
```
**Explanation :** Minimum length subarray is {4, 45, 6} .

### Logic :

1. #### BruteForce Approach :

    - Run three nested loop
    - 1 manages the size of the window.
    - 2 adjusts **i** on the array and it is the start of the window.
    - 3 runs a **k** variable from **i** to the window limit and sums the elements.
    - and checks if it is greater than **x** . If yes the print the size of the window.
    - if no then continue with the looping.


1. #### Optimal Approach :
    - There is an idea if all the elements of the array are positive. If a subarray has sum greater than the given sum then there is no possibility that adding elements to the current subarray the sum will be **x** (given sum). Idea is to use a similar approach to a sliding window. Start with an empty subarray, add elements to the subarray until the sum is less than **x**. If the sum is greater than **x**, remove elements from the start of the current subarray.

    - Algorithm

        1. Create three variables,

            l = 0, sum = 0

        2. Traverse the array from start to end.
        3. Update the variable sum by adding current element,

            sum = sum + array[i]

        4. If the sum is greater than the given sum, update the variable sum as , and update l as, l++.

            sum = sum – array[l]

        5. If the sum is equal to given sum, print the subarray and break the loop.
