package com.company.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Traversal {
    public static void main(String[] args) {
        TreeNode root = TreeNode.sampleTree();

        System.out.print("Preorder: ");
        preorder(root);
        System.out.print("\nInorder: ");
        inorder(root);
        System.out.print("\nPostorder: ");
        postorder(root);
        System.out.print("\nBFS: ");
        bfs(root);
        System.out.print("\nDFS: ");
        dfs(root);
    }

    private static void preorder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    private static void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    private static void postorder(TreeNode root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    private static void bfs(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            TreeNode node = queue.remove();
            System.out.print(node.data + " ");
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }

    private static void dfs(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            System.out.print(node.data + " ");
            if (node.right != null) {
                stack.add(node.right);
            }
            if (node.left != null) {
                stack.add(node.left);
            }
        }
    }
}
