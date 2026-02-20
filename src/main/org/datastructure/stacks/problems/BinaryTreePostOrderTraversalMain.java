package main.org.datastructure.stacks.problems;

import main.org.datastructure.stacks.model.TreeNode;


public class BinaryTreePostOrderTraversalMain {
    public static void main(String[] args) {
        BinaryTreePostOrderTraversal binaryTreePostOrderTraversal = new BinaryTreePostOrderTraversal();

        TreeNode root = null;
        System.out.println("Test case 1: expected: [] | received: "+binaryTreePostOrderTraversal.traversalBinaryTree(root));

        
        root = new TreeNode(1);
        System.out.println("Test case 2: expected: [1] | received: "+binaryTreePostOrderTraversal.traversalBinaryTree(root));

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);

        System.out.println("Test case 3: expected: [3, 2, 1] | received: "+binaryTreePostOrderTraversal.traversalBinaryTree(root));

        root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);

        System.out.println("Test case 4: expected: [3, 2, 1] | received: "+binaryTreePostOrderTraversal.traversalBinaryTree(root));

    }
}
