3.5 Sort Stack
	I - Sort a stack such the the smallest items are on the top.
	D - Sorted stack
	E - 	|3|	
		|9|	
		|1|	
		|5|
		s	helper
			
		|9|	
		|1|	
		|5|	|3|
		s	helper
			
		|1|	|3|
		|5|	|9|
		s	helper

			|1|
			|3|
		|5|	|9|
		s	helper


			|1|
			|3|
			|5|
			|9|
		s	helper
	A - First, create a helper stack and current to keep track of the moved elements from stacks. If the current is less than the the peek at helper then push. If current is grater than peek, pop helper until true.
	Return he sorter array of helper.
	L - I learned that how to transition values using two stacks to sort it. I learend to pay attention to the process.

		