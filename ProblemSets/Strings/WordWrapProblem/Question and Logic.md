**Question:**

Given an array of size N, which denotes the number of characters in one word. The task is simple, count the number of words in a single line with space character between two words.

**Input:**First line contains the number of test cases T. First line of every test case consists of N, denoting number of elements in array. Second line consists of elements in array. Third line consists of characters allowed per line.

**Output:**Single line output,print 2*L spaced integers (where L is the number of lines required to adjust the words with given limit of character per line), denoting from which word to word in every line.(for more clearance of output, look the output in example).

**Constraints:**1<=T<=1001<=N<=100

**Example:**

```
**Input:** 
2
4
3 2 2 5
6
3
3 2 2
4
**Output:** 
1 1 2 3 4 4 
1 1 2 2 3 3
```

**Logic:**

1. Dynamic Programming Approach:
    - The following Dynamic approach strictly follows the algorithm given in solution of Cormen book.
    - First we compute costs of all possible lines in a 2D table lc[][].
    - The value lc[i][j] indicates the cost to put words from i to j in a single line where i and j are indexes of words in the input sequences. If a sequence of words from i to j cannot fit in a single line, then lc[i][j] is considered infinite (to avoid it from being a part of the solution).
    - Once we have the lc[][] table constructed, we can calculate total cost using following recursive formula. In the following formula, C[j] is the optimized total cost for arranging words from 1 to j.
    - The above recursion has **overlapping subproblem property**. For example, the solution of subproblem c(2) is used by c(3), C(4) and so on.
    - So Dynamic Programming is used to store the results of subproblems.
    - The array c[] can be computed from left to right, since each value depends only on earlier values.
    - To print the output, we keep track of what words go on what lines, we can keep a parallel p array that points to where each c value came from.
    - The last line starts at word p[n] and goes through word n. The previous line starts at word p[p[n]] and goes through word p[n] – 1, etc.
    - The function printSolution() uses p[] to print the solution.In the below program, input is an array l[] that represents lengths of words in a sequence.
    - The value l[i] indicates length of the ith word (i starts from 1) in theinput sequence