**Question:**

Given a binary tree, find its level order traversal.Level order traversal of a tree is [breadth-first traversal f](http://www.geeksforgeeks.org/breadth-first-traversal-for-a-graph/)or the tree.

**Example 1:**

```
Input:
    1
  /   \
 3     2
Output: 1 3 2
```

1. Using Queue : 
    - Declare a tree and take its values
    - Pass on root node to the levelOrder method
    - Now declare a Dequeue (Doubly ended queue) of Node
    - Add the root node to the queue
    - Fun the loop while `q.size() > 0`
        - Save the count as `q.size ()`
        - Run a loop `count` times
            - Remove the root from the queue and print it.
            - if `root.left != null` then add it `root.left` to queue.
            - if `root.right != null` then add `root.right` to queue.
