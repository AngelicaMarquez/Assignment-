import java.util.HashMap;

public class checkPermutation {
	public static boolean permutation(String s1, String s2) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0; i<s1.length(); i++) {
			int count1 = map.getOrDefault(s1.charAt(i), 0);
			int count2 = map.getOrDefault(s2.charAt(i), 0);
			
			if(s2.charAt(i)!=s2.charAt(i)) {
				map.put(s1.charAt(i), count1+1);
				map.put(s2.charAt(i), count2-1);
			}
		}
		for(Character C: map.keySet()) {
			if(map.get(C) !=0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(permutation("lolipop", "popilol"));
		
	}
}
