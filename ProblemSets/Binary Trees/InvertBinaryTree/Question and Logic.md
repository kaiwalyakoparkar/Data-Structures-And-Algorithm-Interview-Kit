Take a look at explaination given [here](https://youtu.be/fKgZiCXb6zs)

**Diagram:**
```
	1
   / \
  2   3
```
**Algorithm:**

1. Create a tree and add elements to it
2. Display the tree as before (pre-order traversal preffered)
3. Invert the tree
	1. Traverse to the left node of the parent (1) and mark it as tempLeft (eg: 2 is left in diagram)
	2. coz we are pre-order traversing. now we will go to right for the parent node (1) and mark it tempRight (eg: 3 is right in the diagram)
	3. root is (1 from diagram) and node.left (2 from diagram). Now we will assign node.left as tempRight (3 from diagram)
	4. Then assign node.right as tempLeft (2 from diagram);
4. Now the tree becomes something like below
```
	1
   / \
  3   2
```
5. Again print the tree.