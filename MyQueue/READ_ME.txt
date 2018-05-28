3.4 Queue via Stacks
	I - Implement a MyQueue class which implements a queue using two stacks.
	D - MyQueue class.
	E & A- The charachteristic of a queue is first in, fist out. In stack is last in, first out.
	The order of exist in a queue is a stack reversed. For this I can use one of the stacks as a temporary,
	where I can have the reversed result.

	|4|
	|3|
	|2| 
	|1|	
	stack	temp


		|1|
		|2|
		|3|
		|4|
	stack	temp

	obj.dequeue() -> 1
	obj.dequeue() -> 2
	obj.enqueue(5)
	obj.enqueue(6)

	|6|	|3|
	|5|	|4|
	stack	temp
	
	For the dequeue operation, I will always pop from the temp stackwich is the reversed list. If is empty then
	I pop from stack to temp until stack is empty.
	For enqueue operation, push to stack.
	For peek operation, check if temp is empty. If ture then push from stack to temp until empty. Return peek of temp.
	For empty, if both stacks are empty then is empty.

	L - I learned that to analyze the properties of queues and stacks to be able to solve the problem. Tracing the problem
	and alayzing the staps really helped to solve the problem.
