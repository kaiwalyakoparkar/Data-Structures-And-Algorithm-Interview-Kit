There might be a loop in a linked list and we have to return true - if there is a loop and false - if there isn't a loop

1. Take the head node as the input parameter
2. Create two pointer slow and fast. And initially point them to the head node
3. run a loop until slow becomes null;
    1. slow will move by one step `slow = slow.next` whereas fast will move by two steps `fast = fast.next.next`.
    2. If both colide each other `slow.equals(fast)` then return true
4. Return false (Will trigger only if there is no loop)
