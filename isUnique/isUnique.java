import java.util.HashSet;

public class isUnique {
	public static boolean isUnique1(String s) {
		HashSet<Character> set = new HashSet<Character>();
		for(int i=0; i<s.length(); i++) {
			if(set.contains(s.charAt(i)))
				return false;
			set.add(s.charAt(i));
		}
		return true;
	}
	
	public static void main(String[] args) {
		String s =" ";
		System.out.println(isUnique1(s));
	}
}
