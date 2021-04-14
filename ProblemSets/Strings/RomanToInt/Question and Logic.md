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

1. Mapping Approach :
- Take the input as a string of Roman characters
- Decalre a map and add all the int values to it's respective roman character
- run a for loop and see if i>0 and charAt( i ) > chat( i-1 )
    - If yes then add values of charAt( i ) - 2 * charAt( i-1) in final answer
    - If no then add value of charAt( i ) in final answer
