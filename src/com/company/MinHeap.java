package com.company;

public interface MinHeap<Integer> {

    TreeNode min();

    void add(TreeNode node, TreeNode root);

    TreeNode swapFromTop(TreeNode root);

    TreeNode getRoot();

}
