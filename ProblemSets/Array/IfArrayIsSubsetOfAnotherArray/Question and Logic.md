# If Array Is Subset Of Another Array

Given two arrays: `arr1[0..m-1]` of size `m` and `arr2[0..n-1]` of size `n`. Task is to check whether `arr2[]` is a subset of `arr1[]` or not. Both the arrays can be both unsorted or sorted. It may be assumed that elements in both array are distinct.

#### Input :

The first line of input contains an integer **T** denoting the number of test cases. Then **T** test cases follow. Each test case contains an two integers **m** and **n** denoting the size of **arr1** and **arr2** respectively. The following two lines contains the space separated elements of **arr1** and **arr2** respectively.

#### Output :

Print `"Yes"`(without quotes) if **arr2** is subset of arr1. Print `"No"`(without quotes) if **arr2** is not subset of **arr1**.

### Logic :

1. #### Brute-Force Approach :
    - Use two loops: The outer loop picks all the elements of `arr2[]` one by one. The inner loop linearly searches for the element picked by the outer loop. If all elements are found then return 1, else return 0.


2. #### Hashing function :
    - Create a Hash Table for all the elements of `arr1[]`.
    - Traverse `arr2[]` and search for each element of `arr2[]` in the Hash Table. If element is not found then return 0.
    - If all elements are found then return 1.