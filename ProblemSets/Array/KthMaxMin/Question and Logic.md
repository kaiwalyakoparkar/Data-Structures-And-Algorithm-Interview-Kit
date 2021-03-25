# Find K<sup>th</sup> Maximum & Minimum

Given an array **arr[]** and a number **K** where **K** is smaller than size of array, the task is to find the **K<sup>th</sup>** smallest and largest element in the given array. It is given that all array elements are distinct.

### Example :

```
Input:N = 6
	arr[] = 7 10 4 3 20 15
	K = 3
Output : 7
```
**Explanation :** 3rd smallest element in the given array is 7.

### Logic :

1. #### Sorting Technique:

    - Take the array and sort it in ascending order ( Using inbuilt or curtomized function ).
    - The **k<sup>th</sup>** smallest element will be `arr[k - 1]`.
    - The **k<sup>th</sup>** largest element will be `arr[arr.length - k]`.

2. #### Max Heap and Min heap:

    - **For Min Heap :**
        - Take the array and **k** as inputs ( because it passed to the function as shown below).
        - declare Priority queue ( which heapifies the array in ascending order ).
        - add all the elements in the array to the heap ( `heap.add()` as shown below ).
        - pop the elements in the heap for **k - 1** times ( `heap.poll()` as shown below ).
        - now the peek of the heap will be the **k<sup>th</sup>** smallest element ( `heap.peek()` as shown below ).
        - return `heap.peek()`.

    - **For Max Heap :**
        - Take the array and **k** as inputs ( because it passed to the function as shown below).
        - declare Priority queue but this time in reverse order by ( `Collections.reverseOrder()`  as shown below ).
        - add all the elements in the array to the heap ( `heap.add()` as shown below ).
        - pop the elements in the heap for **k - 1** times ( `heap.poll()` as shown below ).
        - now the peek of the heap will be the **k<sup>th</sup>** smallest element ( `heap.peek()` as shown below ).
        - return `heap.peek()`.
