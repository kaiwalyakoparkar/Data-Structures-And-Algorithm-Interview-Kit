1. Take a linked list
2. Pass it's head node to the removeLinkedList function
3. In detectLoopElement function ------
	1. Declare two pointers `hare` and `tortoise` and initially point then to the head
	2. Now run a loop with a condition `(tortoise != null && hare.next != null)`
	3. In this loop move tortoise by 1 position `tortoise = tortoise.next` and hare by 2 postion `hare = hare.next.next`.
	4. After this 2 movements check if `(tortoise == hare)` if yes then
		1. place hare at the head again (but keep tortoise on the same place) and initialize a `counter = 0`
		2. now move hare and tortoise with 1 postition and check if `tortoise.next == hare.next` if yes then return `counter`.
		3. if not then go in the loop until the `4.2` becomes true and keep on increasing counter of every move of the hare.
	5. If not then Keep going throught the loop
4. This function will detect and delete the loop.