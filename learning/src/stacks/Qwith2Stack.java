package stacks;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 
 * @author trupti.sardesai
 *
 *First, let's see the most easiest way: one queue.
In this method, the point is that after you add one
 element to the queue, rotate the queue to make the tail be the head.
 */
public class Qwith2Stack {

	Stack<Integer> stk1; 
	Stack<Integer> stk2R; 

	/** Initialize your data structure here. */
	public Qwith2Stack() {
		stk1     = new Stack<Integer>();
		// = new LinkedList<Integer>();
		stk2R = new Stack<Integer>();
	}

	/** Push element x to the back of queue. */
	public void push(int x) {
		stk1.push(x);

	}

	/** Removes the element from in front of queue and returns that element. */
	public int pop() {
		peek();
		return stk2R.pop();

	}

	/** Get the front element. */
	public int peek() {
		if(stk2R.empty() && stk1.empty()) return -1;
		else if(stk2R.empty() && !stk1.empty()){
			while(!stk1.empty()){
				stk2R.push(stk1.pop());
			}
		} 
		return stk2R.peek();
	}

	/** Returns whether the queue is empty. */
	public boolean empty() {
		return stk2R.empty() && stk1.empty();
	}



	public static void main(String args[]) {

		Qwith2Stack queue = new Qwith2Stack();

		queue.push(1);
		System.out.println(queue.peek());

		queue.push(2);  
		System.out.println(queue.peek());

		queue.peek();  // returns 1
		System.out.println(queue.peek());

		queue.pop();   // returns 1
		System.out.println(queue.peek());

		queue.empty(); // returns false
		System.out.println(queue.empty());



	}
}
