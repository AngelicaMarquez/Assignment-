import java.util.Stack;

public class stackMin {
	Node1 top;
    int size = 0;
    Stack<Integer> temp = new Stack<Integer>();

    public void push(int x) {
    	if(size==0)
    		top=new Node1(x,x);
    	else{
    		int m=Math.min(x, top.min);
    		top = new Node1(x,m);
    	}
    	size++;
    }

    public void pop(int x) {
    	if(temp.isEmpty())
    		System.out.println("Stack is Empty"); 
    	temp.pop();
    }

    public int top() {
    	return temp.peek();
    }

    public int getMin() {
    	return top.val;
    }
    
 
        public static void main(String[] args)
        {
            stackMin s = new stackMin();
            s.push(3);
            s.push(5);
            s.getMin();
            s.push(2);
            s.push(1);
            s.getMin();
            s.pop();
            s.getMin();
            s.pop();
        }
    }


