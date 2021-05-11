**Question:**
Given a root node reference of a BST and a key, delete the node with the given key in the BST. Return the root node reference (possibly updated) of the BST.

Basically, the deletion can be divided into two stages:

Search for a node to remove.
If the node is found, delete the node.

Example 1:
Input: root = [5,3,6,2,4,null,7], key = 3
Output: [5,4,6,2,null,null,7]
Explanation: Given key to delete is 3. So we find the node with value 3 and delete it.
One valid answer is [5,4,6,2,null,null,7], shown in the above BST.
Please notice that another valid answer is [5,2,6,null,4,null,7] and it's also accepted.

**Answer :**

Checkout the solution [here](https://youtu.be/5_AZcOOc-kM)
- Traverse to the node
- If the node has no left and right then return null (This will give the parent node the value of the node as null i.e it is deleted)
- If the node has only left child then return left child (This will give the parent node the value of the node as child's child. i.e it will skip the first adjacent child)
- If the node has only right child then return right child (This will give the parent node the value of the node as child's chile i.e it will skip the first adjacent child)
- If the node has both the left and rigth child then
    - Find the max in the left child and replace the node's data with the max of left side
    - Delete the replaces element from left side tree.
    - return the node.
