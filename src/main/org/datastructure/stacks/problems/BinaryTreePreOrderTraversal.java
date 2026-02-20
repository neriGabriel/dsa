package main.org.datastructure.stacks.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import main.org.datastructure.stacks.model.TreeNode;


public class BinaryTreePreOrderTraversal {

    public List<Integer> traversalBinaryTree(TreeNode root) {
        if(root == null) return new ArrayList<>();
        
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> output = new ArrayList<>();
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode curr = stack.pop();
            output.add(curr.val);
            if(curr.right != null) stack.add(curr.right);
            if(curr.left != null) stack.add(curr.left);
        }

        return output;
    }
}
