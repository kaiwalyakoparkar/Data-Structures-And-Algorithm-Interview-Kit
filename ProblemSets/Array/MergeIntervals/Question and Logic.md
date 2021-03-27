# Merge Intervals

Given an array of **intervals** where `intervals[i] = [starti, endi]`, merge all overlapping intervals, and return *an array of the non-overlapping intervals that cover all the intervals in the input*.

### Example :

```
Input: intervals = [[1,3],[2,6],[8,10],[15,18]]

Output: [[1,6],[8,10],[15,18]]
```
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].

### Logic : 

1. #### List Approach
    - Take input as a 2-D array with fixed column length as 2 ( `arr[i][2]` )
    - pass this 2-D array to mergeInterval method
    - ***In mergeInterval ( int[ ][ ] interval) method :***
        - if length of interval is or equal to 1 return interval
        - Else sort the interval array on the basis of the first column
        - Make a Arraylist of int[ ] outputArr
        - make int[ ] currentArray and initialize it to interval[ 0 ]
        - Now run a loop form i =1, to interval.length and make int[ ] in = interval[ i ]
    - ***in loop :***
        - make 4 variable currentStart = currentInterval [ 0 ], currentEnd = currentInterval [ 1 ], nextStart = in[ 0 ], nextEnd = in[ 1 ]
        - if currentEnd = nextEnd change currentInterval[ 1 ] to maximum between currenEnd and nextEnd
        - else currentInterval = in and add currentInterval to output list
        - return outputArr.toArray(new int[ outputArr.size( ) ] [ ])  ;
    - ***In main ( ) :***
        - Print the 2-D array