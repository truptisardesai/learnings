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
public class StackWith1Q {

	private Queue<Integer> q;

    /** Initialize your data structure here. */
    public StackWith1Q() {
        q = new LinkedList<Integer>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        q.add(x);
    for(int i = 1; i < q.size(); i ++) { //rotate the queue to make the tail be the head
        q.add(q.remove());
    }
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
          return q.remove();

    }
    
    /** Get the top element. */
    public int top() {
            return q.peek();        

    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
            return q.isEmpty();

    }
    
public static void main(String args[]) {

    	
	StackWith1Q stack = new StackWith1Q();

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
