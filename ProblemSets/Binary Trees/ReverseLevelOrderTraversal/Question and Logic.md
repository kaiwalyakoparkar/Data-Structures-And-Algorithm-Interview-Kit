**Question**:

Given a binary tree of size N, find its reverse level order traversal. ie- the traversal must begin from the last level.

**Example 1:**

```
Input :
        1
      /   \
     3     2

Output: 3 2 1
Explanation:
Traversing level 1 : 3 2
Traversing level 0 : 1
```

**Answer:**
1. Stack and Queue Method
    - Take the input as a `root` node
    - Declare a Queue `q` and Stack `s`
    - Add root node to `q`
    - Run a while loop untile the `q` is not empty
        - We will set the root to the current node.
        - if the root node has right child then add it to `q`
        - if the root node has left child then add it to `q`
        - Then push the root to the stack
    - Now pop the elements in the `s` one by one and print them!
