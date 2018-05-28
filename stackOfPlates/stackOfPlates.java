import java.util.ArrayList;

public class stackOfPlates {

    int maxSize;
    ArrayList<StackNode> s;
    int currentStack;

    public void SetOfStacks(int maxSize){
        this.maxSize = maxSize;
        s = new ArrayList<StackNode>();
        s.add(new StackNode());
        currentStack = 0;
    }

    public void push(int x){
        if(s.get(currentStack).getSize() == maxSize){
            s.add(new StackNode());
            currentStack ++;
        }
        s.get(currentStack).push(x);
    }

    public int pop(){
        StackNode stack = s.get(currentStack);
        if(currentStack == 0 && stack.isEmpty()) {
            System.out.println("stack is empty");
            return 0;
        }
        if(stack.isEmpty()){
            s.remove(currentStack);
            currentStack --;
        }
        stack = s.get(currentStack);
        return stack.pop();
    }

    public int peek(){
        StackNode stack = s.get(currentStack);
        if(!stack.isEmpty())
            return stack.peek();
        System.out.println("stack is empty");
        return 0;
    }

    public int popAt(int index){
        if(index >= s.size()){
            System.out.println("no such index");
            return 0;
        }
        currentStack --;
        return s.get(index).pop();
        
    }
}
