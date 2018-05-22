
public class stringRotation {
	public static boolean isSubstring(String s1, String s2) {
		if(s1.length()!=s2.length())
			return false;
		if(s1.length()==1)
			return false;
		String s3 = s1+s1;
		String s4 = null;
		String s5 = null;
		for(int i=0; i<s3.length(); i++) {
			if(s2.charAt(0) == s3.charAt(i))			
				s4 = s3.substring(i, s2.length());
				s5= s3.substring(s2.length()+1, s2.length()+i);				
				if(s4+s5 == s2)
					return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(stringR("waterbottle", "erbottlewar"));
	}
}
