# Buying And Selling A Share At Most Twice

In daily share trading, a buyer buys shares in the morning and sells them on the same day. If the trader is allowed to make at most 2 transactions in a day, whereas the second transaction can only start after the first one is complete ` Sell -> Buy -> Sell -> Buy `. Given stock prices throughout the day, find out the maximum profit that a share trader could have made.

### Examples:

```
Input:   price[] = {10, 22, 5, 75, 65, 80}
Output:  87
Trader earns 87 as sum of 12, 75 
Buy at 10, sell at 22, 
Buy at 5 and sell at 80
```

### Logic :

1. #### Valley And peak approach
    - take a variable profit and initialize it with zero and then traverse through the array of `price[]` from `(i+1)`<sup>th</sup> position whenever the initial position value is greater than the previous value add it to variable profit