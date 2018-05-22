public class returnktoLast {
	
	public static int kToLast(linkedList s, int k) {
		
		linkedList s1 = new linkedList();
		linkedList s2 = new linkedList();
		s1.head = s.head;
		s2.head = s.head;
		int count=0;
		while(count != k) {
			if(s2.next != null) {
				s2 = s2.next;
				count++;
			} else
				return -1;
		}
		while(s2.next != null) {
			s1=s1.next;
			s2=s2.next;
		}
		return s1.data;
	
	}
}
}
