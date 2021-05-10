**Question**
You are given the root of the tree and you have to find the if the given element is present in the tree or not

**Answer**
Binary Search Tree is a node-based binary tree data structure which has the following properties:  

The left subtree of a node contains only nodes with keys lesser than the node’s key.
The right subtree of a node contains only nodes with keys greater than the node’s key.
The left and right subtree each must also be a binary search tree. 
There must be no duplicate nodes.

- Just check if the currect root is the key
    - if yes then return true
- If not then check if current root's data is > key
    - Search in the left subtree
- If not then check if current root's data is < key
    - Search in the right subtree
