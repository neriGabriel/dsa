package main.org.datastructure.stacks.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import main.org.datastructure.stacks.model.TreeNode;

public class BinaryTreePostOrderTraversal {
    public List<Integer> traversalBinaryTree(TreeNode root) {
        if (root == null) return new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();
        List<Integer> output = new ArrayList<>();

        TreeNode curr = root;
        TreeNode prev = null;

        while(curr != null || !stack.isEmpty()) {
            while(curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            
            TreeNode peek = stack.peek();

            if(peek.right != null && prev != peek.right) curr = peek.right;
            else {
                output.add(peek.val);
                prev = stack.pop();
            }
        }

        return output;
    }
}
