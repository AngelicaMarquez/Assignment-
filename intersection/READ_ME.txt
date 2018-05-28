2.7 Intersection
	I - Determine if two(singly) linked list intersect.
	D - Return intersecting node.
	E - 	1->2->3
			->4->5->6      ---> 4
		7->8->9
		
		    6->7
			->8->4->8	--->8
		5->4->2
		
		From the posibile solutions, an intersection because is the same node, not value, the two lists emerge. Meaning that after the intesection
		all nodes are the same. We do not know the size of the linked list, meaning that one could be smaller than the other one.
		I decided to use the data structure of hashset, because I search for repetitions comparing both lists.
		First, I populated the hash set with the nodes, then transversed the the socond list, searching if contains then return the node.
	A -    4->3->2
			->7->8->9	--->7

		6->9->8->9->1
		6->4->5->6		---> null

		The following cases do not break the code.
	L - 	I learned that hash set can be used in a wide range of problems, mosty having to do with collisions. I learned how the importance of differentiating
		nodes from values.