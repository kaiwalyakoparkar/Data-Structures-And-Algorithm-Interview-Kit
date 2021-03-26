# Segregate Negative And Positive

An array contains both positive and negative numbers in random order. Rearrange the array elements so that all negative numbers appear before all positive numbers.

### Examples :

```
Input: -12, 11, -13, -5, 6, -7, 5, -3, -6

Output: -12 -13 -5 -7 -3 -6 11 6 5
```

**Note :** Order of elements is not important here.

### Logic :

1. #### Sorting : 
    - Take the input as the array
    - sort the array. ( Either inbuilt or self implemented )
    - all the negatives will be seperated from the positives

1. #### 0 Reference : 
    - Take the input as array
    - Declare two pointers **i** and **j** .
    - **i** will move from `arr[0]`<sup>th</sup> location to `arr[arr.length-1]`<sup>th</sup> location. In this it will check if `arr[i] < 0` and **i** is not equal to **j** . If yes, then it will swap `arr[i]` and `arr[j] .
    - if no, then it will simply increment **j** .
    - when both **i** and **j** will reach the last position, the loop will stop.
    - print the array.
