package 栈;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode-cn.com/problems/implement-stack-using-queues/
 * @author yusael
 *
 */
public class _225_用队列实现栈 {
	private Queue<Integer> queueA;
	private Queue<Integer> queueB;
    /** Initialize your data structure here. */
    public _225_用队列实现栈() {
    	queueA = new LinkedList<>();	
    	queueB = new LinkedList<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
    	if(queueB.isEmpty()){
    		queueA.offer(x);
    	}else{
    		queueB.offer(x);
    	}
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
    	if(!queueA.isEmpty()){
    		int n = queueA.size();
    		while(n-- > 1){
    			queueB.offer(queueA.poll());
    		}
    		return queueA.poll();
    	}else{
    		int n = queueB.size();
    		while(n-- > 1){
    			queueA.offer(queueB.poll());
    		}
    		return queueB.poll();
    	}
    	
    }
    
    /** Get the top element. */
    public int top() {
    	if(!queueA.isEmpty()){
    		int n = queueA.size();
    		while(n-- > 1){
    			queueB.offer(queueA.poll());
    		}
    		int res = queueA.peek();
    		queueB.offer(queueA.poll());
    		return res;
    	}else{
    		int n = queueB.size();
    		while(n-- > 1){
    			queueA.offer(queueB.poll());
    		}
    		int res = queueB.peek();
    		queueA.offer(queueB.poll());
    		return res;
    	}
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
    	return queueA.isEmpty() && queueB.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */