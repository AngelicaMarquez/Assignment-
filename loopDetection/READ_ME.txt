2.8 Loop Detection
	I - Given a circular linked list determine the node at the begening of the loop.
	D - Return node
	E - 	a->b->c->d->a		--->a
		
		e->r->t->y->u->e	--->e
		
		In the examples, I can see that the last node and the first node are the same by definition of a circular linked list. I can use the same trick of a hash set
		and search for a node duplicate and return it. If the hash set contains node x, then is the begening of the loop. Otherwise, add the node to the hashset. This 
		will add the nodes until it loops.
		
	A -    null ---> null
		If there is no loop then return null. 
	L - 	I learned the importance of looking at patterns and the meaning of the problem. In here we saw how the loop could be represented as a repetition.