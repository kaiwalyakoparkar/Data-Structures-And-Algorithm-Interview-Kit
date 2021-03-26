**Question:** 

Given an expression string **x**. Examine whether the pairs and the orders of “{“,”}”,”(“,”)”,”[“,”]” are correct in exp.For example, the function should return 'true' for exp = “[()]{}{[()()]()}” and 'false' for exp = “[(])”.

**Example 1:**

```
Input:
{([])}
Output:
true
Explanation:
{ ( [ ] ) }. Same colored brackets can form
balaced pairs, with 0 number of
unbalanced bracket.
```

**Logic:**

1. Using Stack with O(n) complexity :
    - Take input as string
    - Initialize a stack
    - interate through every character of string and
    - if character is  `{`, `[`, `(` the push it into the stack
    - if character is `}`, `]`, `)` and the top is not `{`, `[`, `(` respectively then return false
    - at the end if the stack is empty return `true` else return `false`