3.1 Three in One
	I - How a single array can implement three stacks
	D - Array
	E - To implement 3 stacks in a single array it occurs to me that the array can be subdivided into 3 sections and have 3 integer variables where you hold
    	the current head index of each of the stacks and as we add to the head we advance the head one number, the problem with this implementation is that the stacks
    	will have a fixed size and every stack will be the same size (array.length / 3) once the stack head reaches the next stack top or the end of the array, that
    	stack is considered full.
	A - I used an arrayList becuase of its resizable properties. I keep track of the indeces. The fist one starting from 0. Second strating from length/3. Third one starting from 2n/3. Every time it push and element the indicated index increments 1, and decreases if poped.
	L - I learnedthat you can implement stack using other types of data strucures. Importance of keep strack of the indices.
	
