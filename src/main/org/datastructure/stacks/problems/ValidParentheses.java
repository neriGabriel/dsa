package main.org.datastructure.stacks.problems;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char currentToken = s.charAt(i);
            if (currentToken == '(' || currentToken == '{' || currentToken == '[') {
                stack.push(currentToken);
            } else {
                if(stack.isEmpty()) return false;

                char tokenOnTop = stack.peek();
                if (tokenOnTop == '(' && currentToken == ')' ||
                    tokenOnTop == '{' && currentToken == '}' ||
                    tokenOnTop == '[' && currentToken == ']'
                ) {
                    stack.pop();
                } else return false;
            }
        }

        return stack.empty();
    }
}
