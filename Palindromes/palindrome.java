import java.util.Stack;

public class palindrome {
	public static boolean pali(linkedList s, int length) {
		linkedList temp = new linkedList();
		Stack<Character> stack = new Stack();
		
		for(int i=length/2;temp.next !=null; i++) {
			stack.push(temp.data);
			temp.head=temp.next;
		}
		if(length%2 == 1)
			temp.next=temp.next.next;
		while(temp.next !=null)
			if(stack.pop() != temp.data)
				return false;
		
		return true;	
	}
}
