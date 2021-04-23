package com.company.trees;

import static java.lang.Math.max;

public class Height {
    public static void main(String[] args) {
        TreeNode root = TreeNode.sampleTree();
//        root.left.left.right = new TreeNode("10");
        System.out.println(getHeight(root));

        NryNode nryRoot = NryNode.sampleTree();
        System.out.println(getHeightNary(nryRoot));
    }

    private static int getHeight(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + max(getHeight(root.left), getHeight(root.right));
    }

    public static int getHeightNary(NryNode root) {
        if (root == null)
            return 0;
        int maxHt = 1;
        for (NryNode node: root.children) {
            maxHt = max(maxHt, getHeightNary(node) + 1);
        }
        return maxHt;
    }
}
