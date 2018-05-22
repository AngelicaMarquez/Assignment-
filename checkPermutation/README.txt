1.2 check permutation
	I - Given two strings, decide if one is a permutation of the other. If from string a it can be formed the string b.
	D - Boolean output. True if permutation. False if NOT permutation.
	E - 	"abba", "baba" -> True
		"plant", "lantp" -> True
		"drink", "ink" -> False
		There is a pattern that looks as I can usea hashtable so we want to compare. The disadvantages of a hashset is that it does not allowed to repetitions and we want 
		to keep track of how many charachters there are for each word.
		For this the best solution is a hashmap, where it adds a value for each character in string a and subtracts at the position for eahc character from string b.
	A - 	"lolipop", "popilol" -> True
		The instance where there is the same letter at the middle of the string, return false. Added an if statment that checks if the character is not the same then map 
		the hashmap.
	L - I learned to identified variations of hashtables. How to implement hashmaps.