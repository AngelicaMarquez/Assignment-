2.2 Delete middle node
	I - Imlement an algorithm to delete a node in the middle from a linked list
	D - Does not return value, change linked list
	E - 	1->3->4->6->8->0->2    -->  1->3->4->8->0->2 
		3->7->5->5->4->1->2->3->4->5   -->  3->7->5->5->1->2->3->4->5
		1->2->3 -->  1->3
		To solve the problm it is necessary to have a second pointer to the head. This will allow us to move the require spaces.
		One of the pointer will move n+1, the other pointer will move n+2. When the secon pointer reaches null the fisrt pointer will be in the middle.
		Delete node by pasing the reference of the linked list to the next next node.
	A - 	8->5   --> 5
		I made a case where it deletes the first node if the size is 2.

	L - I reviewed how linked list work. Trick: Pointers at different levels, using its diferents before reaching the end of the list.
		Importance of keeping track of pointer location.
		