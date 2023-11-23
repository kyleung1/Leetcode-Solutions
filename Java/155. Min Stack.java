package Java;

import java.util.Stack;

class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        this.stack = new Stack<>();
        this.minStack = new Stack<>();
    }
    
    public void push(int val) {
        if (minStack.isEmpty() || val <= minStack.peek()) {
            this.minStack.push(val);
        }
        this.stack.push(val);
    }
    
    public void pop() {
        if (stack.peek().equals(minStack.peek())) {
            this.minStack.pop();
        }
        this.stack.pop();
    }
    
    public int top() {
        return this.stack.peek();
    }
    
    public int getMin() {
        return this.minStack.peek();
    }
}