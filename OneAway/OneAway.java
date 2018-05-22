
public class OneAway {
	public static boolean edits(String a, String b) {
		if(a.length()<=1 && a.length() <=1)
			return true;
		if(a.length() == b.length())
			return replace1(a,b);
		if(a.length()-1 == b.length())
			return remove(a,b);
		if(a.length() == b.length()-1)
			return insert(a,b);

	return false;
	}
	
	public static boolean replace1(String a, String b) {
		int count = 0;
		for(int i=0; i<a.length(); i++) {
			if(a.charAt(i) != b.charAt(i)) {
				count++;
			}
		}
		return count>=1;
	}
	
	public static boolean remove(String a, String b) {
		int count = 0;
		int j = 0;
		for(int i=0; i< b.length(); i++) {
			if(a.charAt(j) != b.charAt(i)) {
				if(a.charAt(i+1) != b.charAt(i))
					return false;
				count++;
				j++;
			}
			j++;
		}
		return count>=1;
	}
	
	public static boolean insert(String a, String b) {
		int count = 0;
		int j = 0;
		for(int i=0; i< a.length(); i++) {
			if(a.charAt(i) != b.charAt(j)) {
				if(a.charAt(i) != b.charAt(i+1))
					return false;
				count++;
				j++;
			}
			j++;
		}
		return count>1;
	}
	
	public static void main(String[] args) {
		System.out.println(edits("p",""));
	}
}
