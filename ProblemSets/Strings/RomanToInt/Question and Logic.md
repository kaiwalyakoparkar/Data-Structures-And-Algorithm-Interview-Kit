**Question**

```
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
```
**Logic**

1. Simple Approach :
    - Take input as a string
    - Make a function which returns the integer value for the specified roman character
    - now declare a varible answer with the int value of the last character
    - run a loop from s.length()-2 to 0 and while going check if the current element is smaller than the i+1
    - if yes then substract i+1th element from ans and then add the substraction of the current element and the i+1th element in the answer
    - At the end print the answer.
