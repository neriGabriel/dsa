package main.org.datastructure.stacks.structure;

import java.util.LinkedList;
import java.util.Queue;

public class CustomStack {

    private Queue<Integer> internalQueue;

    public CustomStack() {
        internalQueue = new LinkedList<>();
    }

    public void push(int value) {
        internalQueue.add(value);
        for(int i = 1; i < internalQueue.size(); i++) {
            internalQueue.add(internalQueue.poll());
        }
    } 
    
    public int pop() {
        return internalQueue.poll();
    }

    public int top() {
        return internalQueue.peek();
    }

    public boolean empty() {
        return internalQueue.size() <= 0;
    }
    
}
