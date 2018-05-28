import java.util.HashSet;

public class intersection {
	
	public static Node inter(Node a, Node b){
        Node noIntersection = null;
        HashSet<Node> set = new HashSet<>();
        for(Node x = a; x != null ; x = x.next)
            set.add(x);
        for(Node x = b; x != null ; x = x.next)
            if(set.contains(x))
                return x;
        return noIntersection;
    }
	
	public static void main(String[] args){
		
        Node a = new Node(null, "2");
        Node b = new Node(null, "3");
        Node c = new Node(null, "4");
        Node d = new Node(null, "5");
        Node e = new Node(null, "6");

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        Node a1 = new Node(null, "7");
        Node b1 = new Node(null, "8");
        Node c1 = new Node(null, "9");
        Node d1 = new Node(null, "10");
        Node e1 = new Node(null, "11");

        a1.next = b1;
        b1.next = c1;
        c1.next = d1;
        d1.next = e1;
        e1.next = d;

        Node interPrint = inter(a, a1);
        interPrint.print();

    }
}
