# Next Permutation

Implement **next permutation**, which rearranges numbers into the lexicographically next greater permutation of numbers.

If such an arrangement is not possible, it must rearrange it as the lowest possible order (i.e., sorted in ascending order).

The replacement must be **[in place](http://en.wikipedia.org/wiki/In-place_algorithm)** and use only constant extra memory.

### Example :

```
Input : nums = [1,2,3]

Output : [1,3,2]
```

### Logic : 

1. #### Optimal Approach : 
    - Take the input as the array.
    - make a varible `int mark = -1` .
    - Traverse the array in reverse order and find if `arr[i] > arr[i - 1]` make `mark = i-1` and break the loop.
    - if `mark` is -1 then reverse ( arr , 0) // reverse entire array.
    - else Traverse the array in the reverse order till `mark + 1` and check if any element is greater than mark.
    - when found make the `idx = i` .
    - swap the `arr[mark]` and `arr[idx]` .
    - then reverse the array from `arr[mark+1]` to `arr[arr.length]` .