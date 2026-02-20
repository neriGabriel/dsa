package main.org.datastructure.stacks.problems;

import main.org.datastructure.stacks.structure.CustomQueue;

public class CustomQueueMain {
    public static void main(String[] args) {
        CustomQueue customQueue = new CustomQueue();
        customQueue.push(1);
        customQueue.push(2);
        System.out.println(customQueue.peek());
        customQueue.pop();
        System.out.println(customQueue.empty());
    }
}
