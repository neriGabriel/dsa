package main.org.datastructure.stacks.problems;

import main.org.datastructure.stacks.model.TreeNode;


public class BinaryTreePreOrderTraversalMain {
    public static void main(String[] args) {
        BinaryTreePreOrderTraversal binaryTreePreOrderTraversal = new BinaryTreePreOrderTraversal();
        TreeNode root = null;
        System.out.println("Test case 1: expected [] | received: "+binaryTreePreOrderTraversal.traversalBinaryTree(root));

        root = new TreeNode(1);
        System.out.println("Test case 2: expected [1] | received: "+binaryTreePreOrderTraversal.traversalBinaryTree(root));
        
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);

        System.out.println("Test case 3: expected [1, 2, 3] | received: "+binaryTreePreOrderTraversal.traversalBinaryTree(root));

        root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);

        System.out.println("Test case 4: expected [1, 2, 3] | received: "+binaryTreePreOrderTraversal.traversalBinaryTree(root));

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        System.out.println("Test case 5: expected [1, 2, 4, 5, 3, 6] | received: "+binaryTreePreOrderTraversal.traversalBinaryTree(root));
    }
}
