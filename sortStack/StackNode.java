import java.util.Stack;

public class StackNode {
	Stack<Integer> s;
    private int size;

    public StackNode(){
        s = new Stack<Integer>();
        size = 0;
    }

    public void push(int x){
        s.push(x);
        size ++;
    }

    public int pop(){
        if(!s.isEmpty()) {
            size--;
            return s.pop();
        }
        return 0;
    }

    public int peek(){
        if(!s.isEmpty())
            return s.peek();
        return 0;
    }

    public int getSize() {
        return size;
    }
    public boolean isEmpty(){
        return s.isEmpty();
    }
}
