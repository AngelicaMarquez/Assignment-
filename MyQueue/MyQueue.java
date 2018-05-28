import java.util.Stack;

public class MyQueue {

	Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> temp = new Stack<Integer>();

    public void enqueue(int x) {      
        stack.push(x);
    }
    
    public int dequeue() {
        if(temp.empty())
            while(!stack.empty())
                temp.push(stack.pop());
        int num = (int)temp.pop();
        return num;
    }
    
    public int peek() {
          if(temp.empty())
            while(!stack.empty())
                temp.push(stack.pop()); 
        return (int)temp.peek();
    }
    
    public boolean empty() {
        return temp.empty() && stack.empty();
    }
}

