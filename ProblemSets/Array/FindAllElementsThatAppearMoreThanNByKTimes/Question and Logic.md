# Find All Elements That Appear More Than N/K Times

Given an array of size n, find all elements in array that appear more than n/k times.

### Example :
```
If the input arrays is {3, 1, 2, 2, 1, 2, 3, 3} and k is 4, 
Then the output should be [2, 3]. Note that size of array is 8 (or n = 8).
```

so we need to find all elements that appear more than 2 (or 8/4) times. There are two elements that appear more than two times, 2 and 3.

### Logic : 

1. #### HashMap Solution :
    - Take the input as a array
    - declare `x = n / k` and a HashMap of `< Integer, Integer >`
    - run a loop through the array and check if the element is present in the map
        - If no then put it in the map as `(arr[i] , 1 )`
        - If yes then make `count = mp.getValue(arr[i])` and then put it in the map as `(arr[i], count+1)`
    - then iterated through the map and if the key for the puricular value is greater than `x` then print the Key