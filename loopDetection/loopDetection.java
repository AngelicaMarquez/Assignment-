import java.util.HashSet;

public class loopDetection {
	
    public static Node hasLoop(Node a){
        Node noLoop = null;
        HashSet<Node> map = new HashSet<>();
        for(Node x = a; x != null ; x = x.next){
            if(map.contains(x)) {
                return x;
            } else {
                map.add(x);
            }
        }
        return noLoop;
    }
    
public static void main(String[] args){
		
        Node a = new Node(null, "a");
        Node b = new Node(null, "b");
        Node c = new Node(null, "c");
        Node d = new Node(null, "d");
        Node e = new Node(null, "e");

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = a;


        Node interPrint = hasLoop(a);
        interPrint.print();
}
}
