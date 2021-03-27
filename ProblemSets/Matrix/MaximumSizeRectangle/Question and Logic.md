# Maximum Size Rectangle

Given a binary matrix. Find the maximum area of a rectangle formed only of 1s in the given matrix.

### Example :

```
Input :
	n = 4, m = 4
	M[][] = {{0 1 1 0},
             {1 1 1 1},
             {1 1 1 1},
             {1 1 0 0}
            };

Output : 8
```
**Explanation :** For the above test case the matrix will look like
```
0 1 1 0
1 1 1 1
1 1 1 1
1 1 0 0
```
the max size rectangle is 
```
1 1 1 1
1 1 1 1
```
and area is 4 *2 = 8.

### Logic :

1. #### Histogram & Dynamic Programming :
    - Maintain a stack
    - If stack is empty or value at index of stack is less than or equal to value at current
    - index, push this into stack.
    - Otherwise keep removing values from stack till value at index at top of stack is
    less than value at current index.
    While removing value from stack calculate area
    if stack is empty
    it means that till this point value just removed has to be smallest element
    so area = input[top] * i
    if stack is not empty then this value at index top is less than or equal to
    everything from stack top + 1 till i. So area will
    area = input[top] * (i - stack.peek() - 1);
    Finally maxArea is area if area is greater than maxArea.
    - Refer the videos below to get clear understanding

    [Histogram video](https://www.youtube.com/watch?v=ZmnqCZp9bBs&t=5s)

    [Main solution using histogram](https://www.youtube.com/watch?v=g8bSdXCG-lA&t=124s)
