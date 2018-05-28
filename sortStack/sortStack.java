import java.util.Stack;

public class sortStack {
	
	
	public static Stack<Integer> sort(Stack<Integer> s){
    Stack<Integer> helper = new Stack<Integer>();
    int current;

    while(!s.isEmpty()){
        current = s.pop();
        if(helper.isEmpty() || helper.peek() >= current){
            helper.push(current);
        }
        else{
            while(true){
                if(!helper.isEmpty() && helper.peek() < current){
                    s.push(helper.pop());
                }
                else if(helper.isEmpty()){
                    helper.push(current);
                    break;
                }
                else{
                    helper.push(current);
                    break;
                }
            }
        }
    }

    return helper;
}
	
	 public static void main(String[] args){
	        Stack<Integer> s = new Stack<Integer>();
	        s.push(3);
	        s.push(7);
	        s.push(10);
	        s.push(6);
	        s.push(1);

	        s = sort(s);
	        while(!s.isEmpty())
	            System.out.println(s.pop());
	        System.out.println();
	    }


	    }

