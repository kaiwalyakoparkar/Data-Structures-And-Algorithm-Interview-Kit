Given two integers n and r, find nCr. Since the answer may be very large, calculate the answer modulo 109+7.

**Example 1:**


```text
Input: n = 3, r = 2
Output: 3
Explaination: 3C2 = 3. 
```

**Example 2:**

```text
Input: n = 2, r = 4
Output: 0
Explaination: r is greater than n.
```

**Answer**

```bash

n = 3 and r = 2

Step 0 = dp[ 1,  0, 0];
			 |  \+/\+/
Step 1 = dp[ 1,  1, 0];
			 | \+/\+/
Step 2 = dp[ 1, 2, 1];
			 |\+/\+/
Step 3 = dp[ 1,3, 3];

Step 4 = return 3

```