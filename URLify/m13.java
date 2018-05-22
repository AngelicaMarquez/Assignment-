
public class m13 {
	public static char[] replaceSpace(char[] org, int length) {
		char[] b = new char[org.length];
		int j=0;
		if(length==1)
			return org;
		for(int i=0; i<length;i++) {
			if(org[i] == ' ') {
				b[j] ='%';
				b[j+1] = '2';
				b[j+2] = '0';
				j=j+3;
			}
			else {
				b[j]= org[i];
				j++;
			}
		}	
		return b;
	}
	
	public static void main(String[] str) {
		//char[] a= {'M','r',' ','J','o','h','n',' ','S',' ',' ',' ',' '};
		char[] a= {' '};
		char[] b = replaceSpace(a, 1);
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i]);
		}
	}
}
