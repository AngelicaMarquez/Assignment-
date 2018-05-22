
public class middleNode {
	public static void deleteMiddleNode(linkedList s) {
		
		if(s.head == null)
			return;
		
		if(s.next.next == null)
			s.head=s.next;
		
		linkedList s1 = new linkedList();
		linkedList s2 = new linkedList();
		linkedList temp = new linkedList();
		
		s1.head = s.head;
		s2.head = s.head;
		int count=0;
		
		while(s2.next != null || s2.next.next != null) {
			s1.head=s1.next;
			s2.head=s2.next.next;	
			count++;
		}
		
		
		for(int i=0; temp!=null && i< count; i++) {
			temp.head=temp.next;
		}
		temp.next = temp.next.next;
	}
}
