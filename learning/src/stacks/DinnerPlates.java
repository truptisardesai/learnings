package stacks;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
// DOES NOT WORK
/**
 * 
 * @author trupti.sardesai
 *
 *First, let's see the most easiest way: one queue.
In this method, the point is that after you add one
 element to the queue, rotate the queue to make the tail be the head.
 */
public class DinnerPlates{

	static Stack<Integer>[] stack; 
    static int cap;

    public DinnerPlates(int capacity) {
        cap=capacity;
        stack = new Stack[capacity]; 
    }
    
    public void push(int val) {
        for (int i=0;i<cap;i++){
            if(stack[i].size()!=cap) {
                stack[i].push(val);
                break;
            }
        }
    }
    
    public int pop() {

        for (int i=cap-1;i>=0;i--){
            if (!stack[i].empty())
                return stack[i].pop();
        }
        return -1;
    }
    
    public int popAtStack(int index) {
        if (!stack[index].empty())
                return stack[index].pop();
        return -1;
    }
    
    
public static void main(String args[]) {

	DinnerPlates D = new DinnerPlates(2);  // Initialize with capacity = 2
	D.push(1);
	D.push(2);
	D.push(3);
	D.push(4);
	D.push(5);         // The stacks are now:  2  4
	                   //                        1  3  5
	                   //                        ﹈ ﹈ ﹈
	D.popAtStack(0);   // Returns 2.  The stacks are now:     4
	                   //                                    1  3  5
	                   //                                    ﹈ ﹈ ﹈
	D.push(20);        // The stacks are now: 20  4
	                   //                        1  3  5
	                   //                        ﹈ ﹈ ﹈
	D.push(21);        // The stacks are now: 20  4 21
	                   //                        1  3  5
	                   //                        ﹈ ﹈ ﹈
	D.popAtStack(0);   // Returns 20.  The stacks are now:     4 21
	                   //                                     1  3  5
	                   //                                     ﹈ ﹈ ﹈
	D.popAtStack(2);   // Returns 21.  The stacks are now:     4
	                   //                                     1  3  5
	                    //                                    ﹈ ﹈ ﹈ 
	D.pop();            // Returns 5.  The stacks are now:      4
	                   //                                     1  3 
	                   //                                     ﹈ ﹈  
	D.pop();            // Returns 4.  The stacks are now:   1  3 
	                    //                                    ﹈ ﹈   
	D.pop();            // Returns 3.  The stacks are now:   1 
	                   //                                     ﹈   
	D.pop();            // Returns 1.  There are no stacks.
	D.pop();            // Returns -1.  There are still no stacks.
	
    	
    }


}
