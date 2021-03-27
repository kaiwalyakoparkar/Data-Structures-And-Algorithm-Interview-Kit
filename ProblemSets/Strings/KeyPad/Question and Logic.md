**Question :**

Given a sentence in the form of a string, convert it into its equivalent mobile numeric keypad sequence.

![https://media.geeksforgeeks.org/wp-content/cdn-uploads/Mobile-keypad.png](https://media.geeksforgeeks.org/wp-content/cdn-uploads/Mobile-keypad.png)

**Examples :**

```
Input : GEEKSFORGEEKS
Output : 4333355777733366677743333557777
For obtaining a number, we need to press a
number corresponding to that character for
number of times equal to position of the
character. For example, for character C,
we press number 2 three times and accordingly.

Input : HELLO WORLD
Output : 4433555555666096667775553
```

**Logic:**

1. Matrix Method :
    - For each character, store the sequence which should be obtained at its respective position in an array, i.e. for Z, store 9999. For Y, store 999. For K, store 55 and so on.
    - For each character, subtract ASCII value of ‘A’ and obtain the position in the array pointedby that character and add the sequence stored in that array to a string.
    - If the character is a space, store 0
    - Print the overall sequence.