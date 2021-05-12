**Question**
There is one meeting room in a firm. There are N meetings in the form of (S[i], F[i]) where S[i] is start time of meeting i and F[i] is finish time of meeting i.
What is the maximum number of meetings that can be accommodated in the meeting room when only one meeting can be held in the meeting room at a particular time? Also note start time of one chosen meeting can't be equal to the end time of the other chosen meeting.


Example 1:

Input:
N = 6
S[] = {1,3,0,5,8,5}
F[] = {2,4,6,7,9,9}
Output: 
4
Explanation:
Four meetings can be held with
given start and end timings.

**Answer**
- Take the input as array of start & end times (and n is not mandatory)
- Create objects of start time, end time, and position of it
- Sort the objects according to the end time
- Find the times when end time in lesser than the next start time
- At end return the number of all the possible meeting times

