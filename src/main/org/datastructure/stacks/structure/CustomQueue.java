package main.org.datastructure.stacks.structure;

import java.util.Stack;

public class CustomQueue {
    private Stack<Integer> internalStack;

    public CustomQueue() {
        internalStack = new Stack<>();
    }

    public void push(int x) {
        Stack<Integer> temp = new Stack<>();
        while(!internalStack.isEmpty()) {
            temp.push(internalStack.pop());
        }         
        internalStack.push(x);
        while(!temp.isEmpty()) {
            internalStack.push(temp.pop());
        }       
    }

    public int pop() {
        return internalStack.pop();
    }

    public int peek() {
        return internalStack.peek();
    }

    public boolean empty() {
        return internalStack.empty();
    }
}
