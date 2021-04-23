package com.company.trees;

import java.util.ArrayList;
import java.util.List;

public class NryNode {
    public String data;
    public List<NryNode> children;

    public NryNode() {}

    public NryNode(String data) {
        this.data = data;
        children = new ArrayList<>();
    }

    public NryNode(String data, List<NryNode> _children) {
        this.data = data;
        children = _children;
    }

    public static NryNode sampleTree() {
        List<NryNode> children = new ArrayList<>();
        NryNode root = new NryNode("1", children);
        children.add(new NryNode("2"));
        children.add(new NryNode("3"));
        return root;
    }
}
