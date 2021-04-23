package com.company.trees;

public class TreeNode {
    String data;
    TreeNode left, right;

    public TreeNode(String data) {
        this.data = data;
        left = right = null;
    }

    public static TreeNode sampleTree() {
        TreeNode root = new TreeNode("1");
        root.left = new TreeNode("2");
        root.right = new TreeNode("3");
        root.left.left = new TreeNode("4");
        root.left.right = new TreeNode("5");
        root.right.left = new TreeNode("6");
        root.right.right = new TreeNode("7");
        return root;
    }
}
