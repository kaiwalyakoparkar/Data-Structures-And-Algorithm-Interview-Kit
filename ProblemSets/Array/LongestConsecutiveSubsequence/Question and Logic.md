# Longest Consecutive Subsequence

Given an array of positive integers. Find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the **consecutive numbers can be in any order.**

### Example :

```
Input:
	N = 7
	a[] = {2,6,1,9,4,5,3}
	
Output: 6
```
**Explanation :** The consecutive numbers here are 1, 2, 3, 4, 5, 6. These 6 numbers form the longest consecutive subsquence.

### Logic :

1. #### Naive Approach : 
    - Take the input as the array.
    - Sort the array.
    - linearly iterate through the elements and return the length of highest sequence.


2. #### Hash Set / Map Approach : 
    - Take a input as an array.
    - Add that array to a hash set or map.
    - run a Loop through the array and
        - declare current length and current num.
        - check if the element `arr[i] - 1` is there is hashset
        - If not then run a loop and check if hash set / map contains the element `arr[i] + 1`.
            - if yes then add 1 to current length and current num.
        - make the longestSubSeq as maximum between longestSubSeq and current length.
    - Print the longestSubSeq.