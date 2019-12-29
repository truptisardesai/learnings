package stacks;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @author trupti.sardesai
 *
 *First, let's see the most easiest way: one queue.
In this method, the point is that after you add one
 element to the queue, rotate the queue to make the tail be the head.
 */
public class StackWith2Q {

	//using two queue. The push is inefficient as compared to Stackwith1Q.
	private Queue<Integer> q1,q2;

    /** Initialize your data structure here. */
    public StackWith2Q() {
        q1 = new LinkedList<Integer>(); 
        q2 = new LinkedList<Integer>();

    }
    
    public void push(int x) {
        if(q1.isEmpty()) {
            q1.add(x);
            for(int i = 0; i < q2.size(); i ++)
                q1.add(q2.poll());
        }else {
            q2.add(x);
            for(int i = 0; i < q1.size(); i++)
                q2.add(q1.poll());
        }
    }

    public void pop() {
        if(!q1.isEmpty()) 
            q1.poll();
        else
            q2.poll();
    }
    public int top() {
        return q1.isEmpty() ? q2.peek() : q1.peek();
    }
    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }

    
    
public static void main(String args[]) {

    	
	StackWith2Q stack = new StackWith2Q();

	stack.push(1);
	System.out.println(stack.top()); 
	
	stack.push(2); 
	System.out.println(stack.top());
	
	stack.top();   // returns 2
	System.out.println(stack.top());
	
	stack.pop();   // returns 2
	System.out.println(stack.top());
	
	stack.empty(); // returns false
	System.out.println(stack.empty());
	
    	
    }
}
