1.5 One Way
	I - Find from the two given strings if there is zero or one edit
	D - Return boolean value 
	E - Experiemnts
		pale, ple -> true
		good, god -> true
		coding, coidng ->false
		a, b -> true
		
		I separated the problem in smaller tasks. 
		Replace: Pattern of length being the same, find only one edit
		Remove: Pattern stringA-1=stringB, after finding a removal check if next value is not equal is false. Otherwise keep searching for changes.
		Insert: Pattern stringA=StringB-1, after finding an isertion check if next value is not equal is false. Otherwise keep searching for changes.
	
	A - 	a, b -> true
		p,   -> true
		If there is an empty string and a string legth 1 it returns false, shoulr return true. Added a base case.

	L - I learned the importance of dividing the problem into a smaller tasks. Caheking eahc one of the possible cases, and traying different instances.
		