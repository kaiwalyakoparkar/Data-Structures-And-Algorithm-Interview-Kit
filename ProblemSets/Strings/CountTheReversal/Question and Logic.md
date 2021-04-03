**Question :** 

Given a string **S** consisting only of opening and closing curly brackets **'{'** and **'}'** find out the minimum number of reversals required to make a balanced expression.

**Input**The first line of input contains an integer **T,** denoting the number of test cases. Then **T** test casesfollow. The first line of each test case contains a string **S** consisting only of **{** and **}**.

**Output**Print out minimum reversals required to make **S** balanced. If it cannot be balanced, then print **-1**.

**Examples** 
```
**Input :** }{{}}{{{

**Output:** 3
```

**Logic:**

- First push all the characters of the string into the stack but You have to push only the unbalanced brackets into the stack whenever there occurs balanced brackets you have to pop
- Now again until the stack becomes empty keep popping the stack elements in pair. If the popped element does not follow balanced brackets then increase the count of reversals.That is , if first popped element is '{'
- then increase the counts and if second popped element is '}' then also increase the counts.