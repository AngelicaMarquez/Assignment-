3.3 Stack of Plates
	I -  When a stacks exceeds the threshold create a new stack once the previous exceeds capacity.
	D - SetOfStacks with a threshold. Operetions push and pop return the same as a single stack.
	E - 
		|3|	|6|	|9|
		|2|	|5|	|8|
		|1|	|4|	|7|
		s1	s2	s3
		
		obj.pop() -->9
		obj.pop() -->8

		To create a new stack I have to keep track of the current stack size, this could be done by having a counter the increases one for each new pushed element. Also, keep track of the order of the created stacks.
		For the posible data stuctures to solve the problem are stacks, and an array list the contai each stack. An array list is beneficial for being a resizable array.

	A - Created an array of stack nodes, using an array list. A separate class node for stacks having  method that keeps trac of the size of the stack. For the push method is necessary to see if the current slack is empty. 
		Then take the last non empty stack and push the value. If the size of the stack equals the value of the threshold then create a new stack. For pop, I get the current stack that is the index, pop the node at the top.
		For pop at, get the given index and pop from the arrayList, decrease current index.
	L - I learned to do a resizable array of stack nodes, this helps when we are working with unkown sizes and large number of data. I learned how to manage stacks and implement methods in the stack class.