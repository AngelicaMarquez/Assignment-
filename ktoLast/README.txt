2.2 Return kth to last 
	I - Imlement an algorithm to find the kth to last element of a singly linked list
	D - retruns the kth to last elemenet
	E - 	1->3->4->6->8->0->2    -->  k=3, 8
		3->7->5->5->4->1->2->3->4->5   -->  k=8, 5
		1->2->3-> -->3 k=3, 1
		To solve the problm it is necessary to have a second pinter to the head. This will allow us to move the require spaces.
	A - 	8->5   --> K=3,
		If k is grater than the length of the list return -1.
	L - I reviewed how linked list work. Trick: Pointers at different levels, using its diferents before reaching the end of the list.
		