# Find Maximum & Minimum

Write a program to return minimum and maximum in an array. Your program should make the minimum number of comparisons.

### Logic :

1. #### Iterative: ( O^n )
    - Declare `min` and `max` ( min = 10000000 , max = 0 ).
    - iterate through every element in the array and check if it is greater than `max` OR lesser than `min` and update accordingly.


2. #### Tournament method:( O^log2n )
    - Declare `min` and `max` ( min = 10000000 , max = 0 ).
    - Run two loops.
        - First from `arr[0] to arr[arr.length/2]`.
        - Second from `arr[arr.length/2]` to `arr[arr.length-1]`.
    - and find `max1` and `min1` from the first loop and `max2` and `min2` from the second loop.
    - Compare `max1` and `max2` AND `min1` and `min2`.
    - Print the greater `max` and lower `min`.


3. #### Sorting method:( O^logn ):
    - Sort the array ( here I have used inbuilt function but you can actually implement the sorting technique to solve).
    - Print `arr[0]` as `min` and `arr[arr.length-1]` as `max`.