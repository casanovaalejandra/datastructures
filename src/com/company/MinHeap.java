package com.company;

public interface MinHeap<Integer> {

    TreeNode min(TreeNode root);

    void add(TreeNode node);

    TreeNode swapFromTop(TreeNode root);

    TreeNode swapFromBotton(TreeNode leaf);

}
