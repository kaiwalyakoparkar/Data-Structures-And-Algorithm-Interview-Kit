**Question**

Given an array of integers `nums` sorted in ascending order, find the starting and ending position of a given `target` value.

If `target` is not found in the array, return `[-1, -1]`.

**Follow up:** Could you write an algorithm with `O(log n)` runtime complexity?

**Example 1:**

```
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
```

- Answer:
    1. Binary Search :
        - Take the input as array (num[ ] ) and the target
        - Initialize an res[ ] with size 2 and check call a starting function for res[ 0 ] and ending function for res[ 1 ]
        - Pass the num array and target to both the functions
        - In the start function array
            - Initialize the index to -1 so that if nothing found it can return -1
            - initialize a start = 0 and end = nums.length-1
            - Run a loop with condition start ≤ end
                - Initialize the mid = (start+end)/2
                - check if nums [ mid ] ≥ target
                    - if yes then make end = mid-1;
                    - else start = mid+1;
                - Check if nums[mid] = target
                    - if yes then make index = mid
            - At last Return index
        - In the end function
            - Initialize the index to -1 so that if nothing found it can return -1
            - initialize a start = 0 and end = nums.length-1
            - Run a loop with condition start ≤ end
                - Initialize the mid = (start+end)/2
                - check if nums [ mid ] ≤ target
                    - if yes then make start = mid+1;
                    - else end = mid-1;
                - Check if nums[mid] = target
                    - if yes then make index = mid
            - At last Return index

