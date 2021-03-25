# Find Duplicate Element

Given an array of integers `nums` containing `n + 1` integers where each integer is in the range `[1, n]` inclusive.

There is only **one repeated number** in `nums`, return *this repeated number*.

### Example :

```
Input: nums = [1,3,4,2,2]
Output: 2
```

### Logic :

1. #### Naive Approach :
    - Take input as array
    - run one loop from `i to arr.length-2` location
    - run second loop from `i to arr.length-1` location
    - if `arr[i] = arr[j]` then break out of the loop and return the `arr[i]` or `arr[j]`

1. #### Sorting : 
    - Take input as array
    - sort the array using library function
    - run a loop from `i to arr.length - 2`.
    - and check if `arr[i] = arr[i + 1]`. If yes then return `arr[i]`.

1. #### Extraspace : 
    - Take the input as array
    - sort the array using library function
    - create an `extra[ ]` array of `arr.length` size
    - run the loop from `i to arr.length-1`
    - check if `extra[arr[i]] = 0`. if yes then make `extra[arr[i]] = 1` and if no then return `arr[i]`.

1. #### Linked List / Rabbit and Tortoise method:
    - Take input as array
    - create a linked list and run a loop from `i = 0 to i = arr.length`
    - make `i = arr[i]` and add `arr[i]` to linked list ( as shown in the code )
    - take two pointers `slow` and `fast`. move `slow` by one step and `fast` by two steps
    - whenever they will meet put `fast` on the first element
    - and now move `fast` by one and `slow` by one until they both meet at a point
    - return `slow`.