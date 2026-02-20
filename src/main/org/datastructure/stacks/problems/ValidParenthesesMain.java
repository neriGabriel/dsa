package main.org.datastructure.stacks.problems;

public class ValidParenthesesMain {
    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println("Test case 1 | expected value: true | returned value: "+validParentheses.isValid("()"));
        System.out.println("Test case 2 | expected value: true | returned value: "+validParentheses.isValid("()[]{}"));
        System.out.println("Test case 3 | expected value: false | returned value: "+validParentheses.isValid("(]"));
        System.out.println("Test case 4 | expected value: true | returned value: "+validParentheses.isValid("([])"));
        System.out.println("Test case 5 | expected value: false | returned value: "+validParentheses.isValid("([)]"));
    }
}
