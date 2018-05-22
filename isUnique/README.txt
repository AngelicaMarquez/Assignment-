1.1 Is Unique
	I - Implement an algorithm to determine if a string has all unique characters
	D - Returns boolean value. True: all unique. False: NOT all unique
	E - 	"abcde" -> True
		"vhgnv" -> False
		"a" ->true
		"nn" -> false
		One of the characteristics is that all character have to be different, this is a property of hashmaps.
		I used a hashset because it does not accepts repetitions, search if it containsthe character then it means that
		there is a repetition. Otherwise true.
	A - 	" " -> true
		"" -> True
		It does return the expected value.
	L - I reviewed how to implement hash tables and ita variants, hashSet. The importance of knowing the basic data structures.